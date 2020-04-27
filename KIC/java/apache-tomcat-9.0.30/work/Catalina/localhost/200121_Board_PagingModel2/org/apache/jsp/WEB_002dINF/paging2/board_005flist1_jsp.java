/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-02-26 06:52:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.paging2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelPaging.BoardTO;
import modelPaging.BoardListTO;

public final class board_005flist1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("modelPaging.BoardListTO");
    _jspx_imports_classes.add("modelPaging.BoardTO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	//paging <- 10개씩 나눠서 한페이지를 이루게끔...

	int cpage = (Integer)request.getAttribute("cpage");
	int recordPerPage = (Integer)request.getAttribute("recordPerPage");
	int totalRecord = (Integer)request.getAttribute("totalRecord");
	int totalPage = (Integer)request.getAttribute("totalPage");
	int blockPerPage = (Integer)request.getAttribute("blockPerPage");
	int startBlock = (Integer)request.getAttribute("startBlock");
	int endBlock = (Integer)request.getAttribute("endBlock");
	ArrayList<BoardTO> boardLists = (ArrayList<BoardTO>)request.getAttribute("boardList");
	
	StringBuffer sb = new StringBuffer();

	for (BoardTO to : boardLists) {
		String seq = to.getSeq();
		String subject = to.getSubject();
		String writer = to.getWriter();
		String wdate = to.getWdate();
		int wgap = to.getWgap();
		String hit = to.getHit();

		sb.append("<tr>");
		sb.append("	<td>&nbsp;</td>");
		sb.append("	<td>" + seq + "</td>");
		sb.append("	<td class='left'>");
		sb.append("		<a href='./controller?action=view&cpage=" + cpage + "&seq=" + seq + "'>" + subject + "</a>");
		if (wgap == 0) {
			sb.append("		&nbsp;<img src='./images/icon_hot.gif' alt='HOT'>");
		}
		sb.append("	</td>");
		sb.append("	<td>" + writer + "</td>");
		sb.append("	<td>" + wdate + "</td>");
		sb.append("	<td>" + hit + "</td>");
		sb.append("	<td>&nbsp;</td>");
		sb.append("</tr>");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/board_list.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 상단 디자인 -->\r\n");
      out.write("\t<div class=\"con_title\">\r\n");
      out.write("\t\t<h3>게시판</h3>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\tHOME &gt; 게시판 &gt; <strong>게시판</strong>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"con_txt\">\r\n");
      out.write("\t\t<div class=\"contents_sub\">\r\n");
      out.write("\t\t\t<div class=\"board_top\">\r\n");
      out.write("\t\t\t\t<div class=\"bold\">\r\n");
      out.write("\t\t\t\t\t총 <span class=\"txt_orange\">");
      out.print(totalRecord);
      out.write("</span>건\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--게시판-->\r\n");
      out.write("\t\t\t<div class=\"board\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"3%\">&nbsp;</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"5%\">번호</th>\r\n");
      out.write("\t\t\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"10%\">글쓴이</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"17%\">등록일</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"5%\">조회</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"3%\">&nbsp;</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print(sb);
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- \t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"left\"><a href=\"board_view1.jsp\">adfas</a>&nbsp;<img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./images/icon_hot.gif\" alt=\"HOT\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>asdfa</td>\r\n");
      out.write("\t\t\t\t\t\t<td>2017-01-31</td>\r\n");
      out.write("\t\t\t\t\t\t<td>6</td>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--//게시판-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"align_right\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn_write btn_txt01\"\r\n");
      out.write("\t\t\t\t\tstyle=\"cursor: pointer;\"\r\n");
      out.write("\t\t\t\t\tonclick=\"location.href='./controller?action=write&cpage=");
      out.print(cpage);
      out.write("'\">쓰기</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--페이지넘버-->\r\n");
      out.write("\t\t\t<div class=\"paginate_regular\">\r\n");
      out.write("\t\t\t\t<div align=\"absmiddle\">\r\n");
      out.write("\t\t\t\t\t");

						if (startBlock == 1) {
							out.println("<span><a>&lt;&lt;</a></span>");
						} else {
							out.println("<span><a href='./controller?action=list&cpage=" + (startBlock - blockPerPage)
									+ "'>&lt;&lt;</a></span>");
						}

						out.println("&nbsp;");

						if (cpage == 1) {
							out.println("<span><a>&lt;</a></span>");
						} else {
							out.println("<span><a href='./controller?action=list&cpage=" + (cpage - 1) + "'>&lt;</a></span>");
						}
						out.println("&nbsp;&nbsp;");

						for (int i = startBlock; i <= endBlock; ++i) {
							if (cpage == i) {
								out.println("<span><a><font color='red'>[" + i + "]</font></a></span>");
							} else {
								out.println("<span><a href='./controller?action=list&cpage=" + i + "'>" + i + "</a></span>");
							}
						}

						out.println("&nbsp;&nbsp;");
						if (cpage == totalPage) {
							out.println("<span><a>&gt;</a></span>");
						} else {
							out.println("<span><a href='./controller?action=list&cpage=" + (cpage + 1) + "'>&gt;</a></span>");
						}

						out.println("&nbsp;");

						if (endBlock == totalPage) {
							out.println("<span><a>&gt;&gt;</a></span>");
						} else {
							out.println("<span><a href='./controller?action=list&cpage=" + (startBlock + blockPerPage)
									+ "'>&gt;&gt;</a></span>");
						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--//페이지넘버-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--//하단 디자인 -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
