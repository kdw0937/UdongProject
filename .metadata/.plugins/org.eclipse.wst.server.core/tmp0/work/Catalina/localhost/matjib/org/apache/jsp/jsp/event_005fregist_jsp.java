/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2021-01-21 07:58:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class event_005fregist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("   href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/store_regist.css\">\r\n");
      out.write("<!-- <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>Store_Regist</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery-3.5.1.min.js\"\r\n");
      out.write("   charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   /* 대표사진 */   \r\n");
      out.write("   var sel_files = [];\r\n");
      out.write("\r\n");
      out.write("   $(document).ready(function() {\r\n");
      out.write("      $(\"#thumbnail\").on(\"change\", handleImgFileSelect1);\r\n");
      out.write("   });\r\n");
      out.write("   alter(\"test1\")\r\n");
      out.write("   function fileUploadAction2() {\r\n");
      out.write("      console.log(\"fileUploadAction2\");\r\n");
      out.write("      $(\"#thumbnail\").trigger('click');\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   function handleImgFileSelect1(e) {\r\n");
      out.write("\r\n");
      out.write("      // 이미지 정보들을 초기화\r\n");
      out.write("      sel_files = [];\r\n");
      out.write("      $(\".imgs_wrap2\").empty();\r\n");
      out.write("\r\n");
      out.write("      var files = e.target.files;\r\n");
      out.write("      var filesArr = Array.prototype.slice.call(files);\r\n");
      out.write("\r\n");
      out.write("      var index = 0;\r\n");
      out.write("      filesArr\r\n");
      out.write("            .forEach(function(f) {\r\n");
      out.write("            /*    if (!f.type.match(\"image.*\")) {\r\n");
      out.write("                  alert(\"확장자는 이미지 확장자만 가능합니다.\");\r\n");
      out.write("                  return;\r\n");
      out.write("               } */\r\n");
      out.write("\r\n");
      out.write("               sel_files.push(f);\r\n");
      out.write("\r\n");
      out.write("               var reader = new FileReader();\r\n");
      out.write("               reader.onload = function(e) {\r\n");
      out.write("                  var html = \"<a href=\\\"javascript:void(0);\\\" onclick=\\\"deleteImageAction2(\"\r\n");
      out.write("                        + index\r\n");
      out.write("                        + \")\\\" id=\\\"test\"\r\n");
      out.write("                        + index\r\n");
      out.write("                        + \"\\\"><img src=\\\"\" + e.target.result + \"\\\" data-file='\"+f.name+\"' class='selProductFile' title='Click to remove'></a>\";\r\n");
      out.write("                  $(\".imgs_wrap2\").append(html);\r\n");
      out.write("                  index++;\r\n");
      out.write("\r\n");
      out.write("               }\r\n");
      out.write("               reader.readAsDataURL(f);\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   /* <!-- 미리보기 특정 이미지 삭제--> */\r\n");
      out.write("   function deleteImageAction2(index) {\r\n");
      out.write("      console.log(\"index : \" + index);\r\n");
      out.write("      console.log(\"sel length : \" + sel_files.length);\r\n");
      out.write("\r\n");
      out.write("      sel_files.splice(index, 1);\r\n");
      out.write("\r\n");
      out.write("      var img_id = \"#test\" + index;\r\n");
      out.write("      $(img_id).remove();\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   function fileUploadAction2() {\r\n");
      out.write("      console.log(\"fileUploadAction2\");\r\n");
      out.write("      $(\"#thumbnail\").trigger('click');\r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"store_container\">\r\n");
      out.write("      <form action=\"../event/Addevent.html\" method=\"post\"\r\n");
      out.write("         enctype=\"multipart/form-data\" id=\"fileupload\" name=\"form\">\r\n");
      out.write("<!-- 업체등록이 완료된 경우에는 첫페이지가 관리페이지로 가야함 -->\r\n");
      out.write("         <div class=\"sidebar\">\r\n");
      out.write("            <a class=\"active\" href=\"#home\">이벤트 등록</a>\r\n");
      out.write("            <a href=\"../event/manage.html\">이벤트 관리</a>                        \r\n");
      out.write("         </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <div class=\"content\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"event_no\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-25\">\r\n");
      out.write("                  <label for=\"evnet_name\">이벤트 이름  </label>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-75\">\r\n");
      out.write("                  <input type=\"text\" id=\"event_title\" name=\"event_title\"\r\n");
      out.write("                     placeholder=\"이벤트의 이름을 입력해주세요.\">\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-25\">\r\n");
      out.write("                  <label for=\"event_context\">이벤트 상세설명 </label>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-75\">\r\n");
      out.write("                  <textarea id=\"event_context\" name=\"event_context\"\r\n");
      out.write("                     placeholder=\"이벤트의 내용을 자세하게 설명하세요.\"\r\n");
      out.write("                     style=\"height: 200px\"></textarea>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 대표이미지 등록 -->            \r\n");
      out.write("            <div class=\"row\">            \r\n");
      out.write("               <div class=\"col-25\">\r\n");
      out.write("                  <label for=\"store_thumbnail\">대표 이미지 등록 </label>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("               <div class=\"col-75\" id=\"image_container\">                           \r\n");
      out.write("                  <div class=\"input_wrap\">\r\n");
      out.write("                     <a href=\"javascript:\" onclick=\"fileUploadAction2();\"\r\n");
      out.write("                        class=\"btn\">파일 업로드</a><br/> \r\n");
      out.write("                        <strong>※대표 이미지는 1개만 등록이 가능합니다.</strong>                        \r\n");
      out.write("                        <input type=\"file\" id=\"thumbnail\" name=\"thumbnail\" style=\"display:none\"/>                        \r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- 미리보기  -->\r\n");
      out.write("                  <div>\r\n");
      out.write("                     <div class=\"imgs_wrap2\">                     \r\n");
      out.write("                        <img id=\"img\" />\r\n");
      out.write("                     </div>                     \r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"store_bottom\">\r\n");
      out.write("               <input type=\"submit\" value=\"등록하기 \">\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </form>\r\n");
      out.write("\r\n");
      out.write("      <!--    <form id=\"fileForm\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <input type=\"file\" name=\"file\" multiple/>\r\n");
      out.write("         </form> -->\r\n");
      out.write("   </div>\r\n");
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
