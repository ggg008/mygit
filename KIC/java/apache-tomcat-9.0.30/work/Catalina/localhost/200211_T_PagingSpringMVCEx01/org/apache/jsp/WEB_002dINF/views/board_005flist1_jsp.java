/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-02-11 07:37:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.exam.model1.BoardTO;
import com.exam.model1.BoardListTO;
import java.util.ArrayList;

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
    _jspx_imports_classes.add("com.exam.model1.BoardListTO");
    _jspx_imports_classes.add("com.exam.model1.BoardTO");
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
      out.write("  \r\n");
      out.write("\r\n");

	BoardListTO listTO = (BoardListTO)request.getAttribute( "listTO" );

	int cpage = listTO.getCpage();

	int recordPerPage = listTO.getRecordPerPage();
	int totalRecord = listTO.getTotalRecord();
	int totalPage = listTO.getTotalPage();
	int blockPerPage = listTO.getBlockPerPage();
	
	int startBlock = listTO.getStartBlock();
	int endBlock = listTO.getEndBlock();
	
	ArrayList<BoardTO> boardLists = listTO.getBoardLists();
	
	StringBuffer sbHtml = new StringBuffer();

	for( BoardTO to : boardLists ) {
		String seq = to.getSeq();
		String subject = to.getSubject();
		String writer = to.getWriter();
		String wdate = to.getWdate();
		String hit = to.getHit();
		int wgap = to.getWgap();
			
		sbHtml.append( "<tr>" );
		sbHtml.append( "	<td>&nbsp;</td>" );
		sbHtml.append( "	<td>" + seq + "</td>" );
		sbHtml.append( "	<td class='left'>" );
		sbHtml.append( "		<a href='./view.do?cpage=" + cpage + "&seq=" + seq + "'>" + subject + "</a>" );
		if(wgap == 0) {
			sbHtml.append( "		&nbsp;<img src='./images/icon_hot.gif' alt='HOT'>" );
		}
		sbHtml.append( "	</td>" );
		sbHtml.append( "	<td>" + writer + "</td>" );
		sbHtml.append( "	<td>" + wdate + "</td>" );
		sbHtml.append( "	<td>" + hit + "</td>" );
		sbHtml.append( "	<td>&nbsp;</td>" );
		sbHtml.append( "</tr>" );
	}

      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/board_list.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 상단 디자인 -->\r\n");
      out.write("<div class=\"con_title\">\r\n");
      out.write("\t<h3>게시판</h3>\r\n");
      out.write("\t<p>HOME &gt; 게시판 &gt; <strong>게시판</strong></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"con_txt\">\r\n");
      out.write("\t<div class=\"contents_sub\">\r\n");
      out.write("\t\t<div class=\"board_top\">\r\n");
      out.write("\t\t\t<div class=\"bold\">총 <span class=\"txt_orange\">");
      out.print(totalRecord );
      out.write("</span>건</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--게시판-->\r\n");
      out.write("\t\t<div class=\"board\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th width=\"3%\">&nbsp;</th>\r\n");
      out.write("\t\t\t\t<th width=\"5%\">번호</th>\r\n");
      out.write("\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t<th width=\"10%\">글쓴이</th>\r\n");
      out.write("\t\t\t\t<th width=\"17%\">등록일</th>\r\n");
      out.write("\t\t\t\t<th width=\"5%\">조회</th>\r\n");
      out.write("\t\t\t\t<th width=\"3%\">&nbsp;</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("<!-- 시작 -->\r\n");
      out.print(sbHtml );
      out.write("\r\n");
      out.write("<!-- 끝 -->\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t<!--//게시판-->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"align_right\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn_write btn_txt01\" style=\"cursor: pointer;\" onclick=\"location.href='./write.do?cpage=");
      out.print(cpage );
      out.write("'\">쓰기</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--페이지넘버-->\r\n");
      out.write("\t\t<div class=\"paginate_regular\">\r\n");
      out.write("\t\t\t<div align=\"absmiddle\">\r\n");

	if( startBlock == 1 ) {
		out.println( "<span>&lt;&lt;</span>" );	
	} else {
		out.println( "<span><a href='./list.do?cpage=" + (startBlock - blockPerPage) + "'>&lt;&lt;</a></span>" );
	}
	out.println( "&nbsp;" );

	if( cpage == 1 ) {
		out.println( "<span><a>&lt;</a></span>");
	} else {
		out.println( "<span><a href='./list.do?cpage=" + (cpage-1) + "'>&lt;</a></span>");
	}
	
	out.println( "&nbsp;&nbsp;" );
	
	for(int i=startBlock; i<=endBlock ; i++) {
		if( cpage == i ) {
			out.println( "<span style='color:red;'><a>[" + i + "]</a></span>" ); 	
		} else {
			out.println( "<span><a href='./list.do?cpage=" + i + "'>" + i + "</a></span>" );
		}
	}
	
	out.println( "&nbsp;&nbsp;" );
	
	if( cpage == totalPage ) {
		out.println( "<span><a>&gt;</a></span>");
	} else {
		out.println( "<span><a href='./list.do?cpage=" + (cpage+1) + "'>&gt;</a></span>");
	}

	out.println( "&nbsp;" );
	if( endBlock == totalPage ) {
		out.println( "<span><a>&gt;&gt;</a></span>" );
	} else {
		out.println( "<span><a href='./list.do?cpage=" + ( startBlock + blockPerPage ) + "'>&gt;&gt;</a></span>" );
}

      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--//페이지넘버-->\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--//하단 디자인 -->\r\n");
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
