/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-01-16 05:44:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mariadb.simple2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class board_005fwrite1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/board_write.css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.onload = function() {\r\n");
      out.write("\t\tdocument.getElementById('submit1').onclick = function() {\r\n");
      out.write("\t\t\t//alert('test');\r\n");
      out.write("\t\t\t//필수 입력 요소 검사\r\n");
      out.write("\t\t\tif (document.frm.info.checked == false) {\r\n");
      out.write("\t\t\t\talert('동의하셔야 합니다.');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (document.frm.writer.value.trim() == '') {\r\n");
      out.write("\t\t\t\talert('이름을 입력하셔야 합니다.');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (document.frm.password.value.trim() == '') {\r\n");
      out.write("\t\t\t\talert('비밀번호를 입력하셔야 합니다.');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (document.frm.subject.value.trim() == '') {\r\n");
      out.write("\t\t\t\talert('제목을 입력하셔야 합니다.');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tdocument.frm.submit();\r\n");
      out.write("\t\t};\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
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
      out.write("\t\t<form action=\"board_write1_ok.jsp\" method=\"post\" name=\"frm\">\r\n");
      out.write("\t\t\t<div class=\"contents_sub\">\r\n");
      out.write("\t\t\t\t<!--게시판-->\r\n");
      out.write("\t\t\t\t<div class=\"board_write\">\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"top\">글쓴이</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"top\" colspan=\"3\"><input type=\"text\" name=\"writer\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"\" class=\"board_view_input_mail\" maxlength=\"5\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><input type=\"text\" name=\"subject\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"board_view_input\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>비밀번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><input type=\"password\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"\" class=\"board_view_input_mail\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>내용</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><textarea name=\"content\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"board_editor_area\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>이메일</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><input type=\"text\" name=\"mail1\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"board_view_input_mail\" /> @ <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"mail2\" value=\"\" class=\"board_view_input_mail\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t<td\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"text-align: left; border: 1px solid #e0e0e0; background-color: f9f9f9; padding: 5px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"padding-top: 7px; padding-bottom: 5px; font-weight: bold; padding-left: 7px; font-family: Gulim, Tahoma, verdana;\">※\r\n");
      out.write("\t\t\t\t\t\t\t\t\t개인정보 수집 및 이용에 관한 안내</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"padding-left: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 97%; height: 95px; font-size: 11px; letter-spacing: -0.1em; border: 1px solid #c5c5c5; background-color: #fff; padding-left: 14px; padding-top: 7px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t1. 수집 개인정보 항목 : 회사명, 담당자명, 메일 주소, 전화번호, 홈페이지 주소, 팩스번호, 주소 <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t2. 개인정보의 수집 및 이용목적 : 제휴신청에 따른 본인확인 및 원활한 의사소통 경로 확보 <br /> 3.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t개인정보의 이용기간 : 모든 검토가 완료된 후 3개월간 이용자의 조회를 위하여 보관하며, 이후 해당정보를 지체\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t없이 파기합니다. <br /> 4. 그 밖의 사항은 개인정보취급방침을 준수합니다.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"padding-top: 7px; padding-left: 5px; padding-bottom: 7px; font-family: Gulim, Tahoma, verdana;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"info\" value=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"input_radio\"> 개인정보 수집 및 이용에 대해 동의합니다.\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"btn_area\">\r\n");
      out.write("\t\t\t\t\t<div class=\"align_left\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn_list btn_txt02\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"cursor: pointer;\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"location.href='board_list1.jsp'\">목록</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"align_right\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" id=\"submit1\" class=\"btn_write btn_txt01\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"cursor: pointer;\">등록</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--//게시판-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 하단 디자인 -->\r\n");
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
