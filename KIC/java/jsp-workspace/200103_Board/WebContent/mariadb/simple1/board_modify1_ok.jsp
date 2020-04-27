<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.SQLException"%>

<%
	request.setCharacterEncoding("utf-8");

	String seq = request.getParameter("seq");
	String subject = request.getParameter("subject");
	String writer = request.getParameter("writer");
	String mail = "";
	if (!request.getParameter("mail1").equals("") && !request.getParameter("mail2").equals("")) {
		mail = request.getParameter("mail1") + "@" + request.getParameter("mail2");
	}
	String password = request.getParameter("password");
	String content = request.getParameter("content");

	content = request.getParameter("content").replaceAll("\n", "<br>");
	content = request.getParameter("content").replaceAll(" ", "&nbsp;");

	System.out.println(seq);
	System.out.println(writer);
	System.out.println(subject);
	System.out.println(password);
	System.out.println(mail);
	System.out.println(content);

	Connection conn = null;
	PreparedStatement pstmt = null;

	int flag = 1;

	try {
		String url = "jdbc:mysql://localhost:3306/project";
		String user = "project";
		String pass = "123456";

		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, pass);

		String sql = "UPDATE board1 SET writer=?, subject=?, content=?, mail=? WHERE seq=? AND password=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, writer);
		pstmt.setString(2, subject);
		pstmt.setString(3, content);
		pstmt.setString(4, mail);
		pstmt.setString(5, seq);
		pstmt.setString(6, password);

		int result = pstmt.executeUpdate();
		if (result == 1) {
			flag = 0;
		}

	} catch (ClassNotFoundException e) {
		System.out.println(e.getClass().getName() + " : " + e.getMessage());
	} catch (SQLException e) {
		System.out.println(e.getClass().getName() + " : " + e.getMessage());
	} finally {
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();//jsp 가 자동으로 try를 추가함을 유의
	}

	/* if(flag == 0) {
		response.sendRedirect("board_list1.jsp");
	} else {
		response.sendRedirect("board_write1.jsp");
	} */

	out.println("<script type='text/javascript'>");
	if (flag == 0) {
		out.println("alert('글수정에 성공했습니다.');");
		out.println("location.href='board_view1.jsp?seq=" + seq + "';");
	} else {
		out.println("alert('글수정에 실패했습니다.');");
		out.println("history.back();");
	}
	out.println("</script>");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>