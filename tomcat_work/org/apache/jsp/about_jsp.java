/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M4
 * Generated at: 2016-11-07 14:54:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/_include/menu.jsp", Long.valueOf(1478528338560L));
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>天天學桌遊</title>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"container\"> \n");
      out.write("<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<img border=\"0\" width=\"100%\" height=\"350\" src=\"gameboardbg.jpg\" alt=\"bvcb\" />\n");
      out.write("\t\t\t\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style >\n");
      out.write("h1 {\n");
      out.write("    font-size: 700%;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #0B615E;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("\n");
      out.write("    float: left;\n");
      out.write("    border-right:1px solid #bbb;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li:last-child {\n");
      out.write("    border-right: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("    background-color: #111;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center><table style=\"border: 0px solid yellow;\" style=\"width:100%\">\n");
      out.write("\t<tr>\n");
      out.write("\t<th>\n");
      out.write("\t<image src=avatar1.png width=\"100px\" height=\"90\">\n");
      out.write("\t</th>\n");
      out.write("\t\t<th>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  <li><a class=\"active\" href=\"index.jsp\" target=\"_self\">Home</a></li>\n");
      out.write("\t\t\t\t  <li><a href=\"about.jsp\" target=\"_self\">About us</a></li>\n");
      out.write("\t\t\t\t  <li><a href=\"book.jsp\" target=\"_self\">Shop</a></li>\n");
      out.write("\t\t\t\t  <li><a href=\"contact.jsp\" target=\"_self\">Contact us</a></li>\n");
      out.write("\t\t\t\t  <li class=\"m-5\"><a href=\"rent.jsp\" target=\"_self\">Status</a></li>\n");
      out.write("\t\t\t\t  <li style=\"float:right\"><a href=\"register.jsp\" target=\"_self\">Sign up</a></li>\n");
      out.write("\t\t\t\t  <li class=\"m-7\"><a href=\"login.jsp\" target=\"_self\">\n");
      out.write("\t\t\t\t");
	if ( session.getAttribute ("member_name") != null) {
      out.write("\n");
      out.write("\t\t\t\tMODIFY\n");
      out.write("\t\t\t\t");
} else {
      out.write("\n");
      out.write("\t\t\t\tSign in\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t");
	if ( session.getAttribute ("member_name") != null) {
      out.write("\n");
      out.write("\t\t\t\t<li class=\"m-8\"><a href=\"logout.jsp\" target=\"_self\">Log out</a></li>\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("        \n");
      out.write("\n");
      out.write("</th>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t\t</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("<center><tr>\n");
      out.write("\t<td><img src=\"intro1.jpg\" width=\"85\" height=\"70\" alt=\"天天學桌遊\" border=\"0\"></td>\n");
      out.write("\t<td width=\"40%\"><h1 style=\"color:blue;\" size= 300%;\">公司介紹</h1>\n");
      out.write("\t<h3>成立於85年\n");
      out.write("大慧租書廣場       看啥租啥正忠店\n");
      out.write("目前1-3樓出租書籍,超過15萬本,全店總面積超過百坪\n");
      out.write("主要販售漫畫小說雜誌參考書和各類小商品、優惠電影票券、遊樂園區票券、遊戲點數卡指定販售據點\n");
      out.write(" 公司租書租片會員超過五千人以上\n");
      out.write("</h3></td>\n");
      out.write("<td><img src=\"service.jpg\" width=\"75\" height=\"60\" alt=\"看啥租啥租書店\" border=\"0\"></td>\n");
      out.write("\t<td width=\"40%\"><h1 style=\"color:blue;\" size= 300%;\">服務</h1>\n");
      out.write("\t<h3>1. 租借(販售)漫畫,文藝,武俠小說,雜誌,各類文學叢書.DVD</h3>\n");
      out.write("<h3>2. 販售各類優惠電影票券,遊樂園區票券\n");
      out.write("遊戲點數卡)指定販售據點等</h3>\n");
      out.write("<h3>3. 二手書賣場收購各類中古書籍</h3></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<center>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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