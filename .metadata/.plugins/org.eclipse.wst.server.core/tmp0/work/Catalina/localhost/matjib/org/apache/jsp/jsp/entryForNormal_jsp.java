/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2021-01-03 11:23:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class entryForNormal_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/entryForm.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"store_container\">\r\n");
      out.write("\t\t<form action=\"../entry/entry.html\" class=\"form\" id=\"fileupload\"\r\n");
      out.write("\t\t\tenctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"sidebar\">\r\n");
      out.write("\t\t\t\t <a class=\"active\" href=\"#home\">일반 회원 가입</a>\r\n");
      out.write("\t\t\t\t <a href=\"#\">기업 회원 가입</a>\t\t\t\t \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"content\">\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t<label for=\"name\">이름 :</label> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-75\">\r\n");
      out.write("\t\t\t\t <input type=\"text\" name=\"name\"\tid=\"name\" placeholder=\"이름을  입력하세요 \">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t\t<label for=\"id\">아이디 : </label>\r\n");
      out.write("\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-75\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"id\"\r\n");
      out.write("\t\t\t\t\tname=\"user_id\" placeholder=\"아이디를 입력해 주세요.\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t\t<label for=\"password\">비밀번호 : </label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-75\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\" class=\"password\" placeholder=\"비밀번호를 입력하세요 .\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t\t<label for=\"passwordCheck\" >비밀번호 확인 : </label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-75\">\r\n");
      out.write("\t\t\t\t\t<input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\tname=\"passwordCheck\" id=\"passwordCheck\" class=\"passwordCheck\" placeholder=\"확인 비밀번호를 입력하세요.\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t\t<label for=\"nickname\">닉네임 : </label></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-75\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"nickname\" name=\"nickname\" placeholder=\"사용할 닉네임을 입력해주세요 .\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t\t<label for=\"email\">이메일 : </label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-75\">\r\n");
      out.write("\t\t\t\t\t<input type=\"email\" id=\"email\" name=\"email\" placeholder=\"이메일 주소를 입력하세요.\"> \r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row tel\">\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t\t<label for=\"phone\">전화번호 : </label>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t<select path=\"phone1\" name=\"phone1\">\r\n");
      out.write("\t\t\t\t\t<option value=\"02\">02</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"02\">031</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"02\">010</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"phone_back\" name=\"phone2\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"phone_back\" name=\"phone3\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t\t<label for=\"gender\">성별 : </label> \r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<div class=\"col-75\">\t\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" value=\"M\" name=\"gender\" checked id=\"gender\"> 남자\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\"\tvalue=\"F\" name=\"gender\"> 여자 \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t\t<label for=\"birth\">생일 : </label>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<div class=\"col-65\">\r\n");
      out.write("\t\t\t\t\t <input type=\"date\" id=\"birth\" name=\"birth\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-25\">\r\n");
      out.write("\t\t\t\t\t<label for=\"profile\">프로필 : </label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-75\">\r\n");
      out.write("\t\t\t\t <img id=\"output_image\" />\r\n");
      out.write("\t\t\t\t\t <input type=\"file\" accept=\"image/*\"\r\n");
      out.write("\t\t\t\t\tonchange=\"preview_image(event)\" name=\"image\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"store_bottom\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"grade\" value=\"N\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"가입하기\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"../js/entry.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
