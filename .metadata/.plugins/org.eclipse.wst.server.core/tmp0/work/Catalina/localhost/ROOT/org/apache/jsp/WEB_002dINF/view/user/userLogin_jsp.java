/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-11-21 14:13:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>로그인</title>\r\n");
      out.write("\t<!-- Meta tag Keywords -->\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t<meta name=\"keywords\" content=\"Validify Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements\"\r\n");
      out.write("\t/>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\taddEventListener(\"load\", function () {\r\n");
      out.write("\t\t\tsetTimeout(hideURLbar, 0);\r\n");
      out.write("\t\t}, false);\r\n");
      out.write("\r\n");
      out.write("\t\tfunction hideURLbar() {\r\n");
      out.write("\t\t\twindow.scrollTo(0, 1);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- Meta tag Keywords -->\r\n");
      out.write("\t<!-- css files -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/assets/css/logstyle.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t<!-- Style-CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/assets/css/fontawesome-all.css\">\r\n");
      out.write("\t<!-- Font-Awesome-Icons-CSS -->\r\n");
      out.write("\t<!-- //css files -->\r\n");
      out.write("\t<!-- web-fonts -->\r\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Nova+Round\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- //web-fonts -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- title -->\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<h1 onclick=\"javacript:location.href='/main.do'\">\r\n");
      out.write("\t\t\t<span>L</span>oGo\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\t<!-- //title -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- content -->\r\n");
      out.write("\t<div class=\"sub-main-w3\">\r\n");
      out.write("\t\t<form id=\"demo\" novalidate action=\"/user/userLoginProc.do\" method=\"post\">\r\n");
      out.write("\t\t\t<h2>로그인</h2>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<input type=\"email\" class=\"form-control textbox\" name=\"email\" placeholder=\"E-mail\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" class=\"form-control textbox\" name=\"password\" placeholder=\"Password\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group-2\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-default btn-osx btn-lg\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-long-arrow-alt-right\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"alert alert-success hidden\" role=\"alert\">You Have Successfully Logged In</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<!-- //switch -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //content -->\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<span><a href=\"/user/userInfoFind.do\" style=\"color:white;\">아이디/비밀번호 찾기</a></span>\r\n");
      out.write("\t\t<span>&nbsp;&nbsp;&nbsp;</span>\r\n");
      out.write("\t\t<span><a href=\"/user/userReg.do\" style=\"color:white;\">회원가입</a></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<!-- copyright -->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<p>&copy; 2018 Validify Login Form. All rights reserved | Design by\r\n");
      out.write("\t\t\t<a href=\"http://w3layouts.com\">W3layouts</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //copyright -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
