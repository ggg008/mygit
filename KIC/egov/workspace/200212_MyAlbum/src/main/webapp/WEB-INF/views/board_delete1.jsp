﻿<%@page import="com.album.model.AlbumBoardTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%

	pageContext.include("url_pathfinder.jsp");

	String cpage = (String)request.getAttribute("cpage");
	AlbumBoardTO to = (AlbumBoardTO)request.getAttribute("to");

	String seq = request.getParameter("seq");

	String subject = to.getSubject();
	String writer = to.getWriter();
	String imgname = to.getImgname();
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/board_write.css">
</head>

<body>
	<!-- 상단 디자인 -->
	<div class="contents1">
			
		<jsp:include page="board_login.jsp">
			<jsp:param value="${ sessionScope.album_isLogin }" name="isLogin" />
		</jsp:include>
	
		<div class="con_title">
			<p style="margin: 0px; text-align: right">
				<img style="vertical-align: middle" alt=""
					src="./images/home_icon.gif" /> &gt; 커뮤니티 &gt; <strong>여행지리뷰</strong>
			</p>
		</div>

		<form action="./delete_ok.do" method="post" name="frm"
			onsubmit="return frmsubmit()">
			<!-- 페이지 이동 -->
			<input type="hidden" name="seq" value="<%=seq%>"> <input
				type="hidden" name="imgname" value="<%=imgname%>">
			<div class="contents_sub">
				<!--게시판-->
				<div class="board_write">
					<table>
						<tr>
							<th class="top">글쓴이</th>
							<td class="top" colspan="3"><input type="text" name="writer"
								value="<%=writer%>" class="board_view_input_mail" maxlength="5" /></td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="3"><input type="text" name="subject"
								value="<%=subject%>" class="board_view_input" /></td>
						</tr>
						<tr>
							<th>비밀번호</th>
							<td colspan="3"><input type="password" name="password"
								value="" class="board_view_input_mail" /></td>
						</tr>
					</table>
				</div>

				<div class="btn_area">
					<div class="align_left">
						<button type="button" class="btn_list btn_txt02"
							style="cursor: pointer;"
							onclick="location.href='./list.do?cpage=<%=cpage%>'">목록</button>
						<button type="button" class="btn_list btn_txt02"
							style="cursor: pointer;"
							onclick="location.href='./view.do?cpage=<%=cpage%>&seq=<%=seq%>'">보기</button>
					</div>
					<div class="align_right">
						<button type="submit" class="btn_write btn_txt01"
							style="cursor: pointer;">삭제</button>
					</div>
				</div>
				<!--//게시판-->
			</div>
		</form>
	</div>
	<!-- 하단 디자인 -->

</body>
</html>
