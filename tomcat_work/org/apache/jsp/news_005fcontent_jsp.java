/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M4
 * Generated at: 2016-11-07 14:27:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import teachDB.DbBean;
import StringFormat.pattern;

public final class news_005fcontent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


 private String  getTitle(String title){
 		String shortString = "";
       		if( title.length()> 10)
       			shortString = title.substring(0,10)+"...";
       		else
       			shortString = title;
       		return 	shortString;
        }
private Object[]  getValue(List sqllist,String[] volumn){
 		Object[] rValue = new Object[volumn.length];
       		for(int i=0;i<sqllist.size();i++){
			Map map = (Map) sqllist.get(i);
				for(int j=0;j<rValue.length;j++){
					rValue[j] = map.get(volumn[j]);
				}
			}
       		return 	rValue;
        }

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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("StringFormat.pattern");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("teachDB.DbBean");
    _jspx_imports_classes.add("java.util.Map");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

	request.setCharacterEncoding("UTF-8");
	int idx = Integer.parseInt((String)request.getParameter("id"));
	DbBean db = new DbBean();
	List newslist = null;
	List forwardlist = null;
	List backwardlist = null;
	Object[] nowValue = null;
	Object[] forwardValue = null;
 	Object[] backwardValue = null;
	String[] nowvolum = {"n_order","n_title","n_content","n_date"};
	String[] othervolum = {"n_order","n_title"};
	List AllNews = db.SelectRS("select * from newslist where deleteflag = 0 order by n_order ");
	int newscount = AllNews.size();
	List idList = new ArrayList();
	idList.add(idx);
	 newslist = db.SelectRSwhere("select * from newslist where n_order = ? and deleteflag = 0",idList);
	if(idx > 1){
		List fidList = new ArrayList();
		fidList.add(idx-1);
	 	forwardlist = db.SelectRSwhere("select * from newslist where n_order = ? and deleteflag = 0",fidList);
		forwardValue = getValue(forwardlist,othervolum);
	}
	if(idx < newscount){
		List bidList = new ArrayList();
		bidList.add(idx+1);
	 	backwardlist = db.SelectRSwhere("select * from newslist where n_order = ? and deleteflag = 0",bidList);
		backwardValue = getValue(backwardlist,othervolum);
	}	
    nowValue = getValue(newslist,nowvolum);

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>測試</title>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"container\">\n");
      out.write("       <table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<img border=\"0\" width=\"100%\" height=\"350\" src=\"library.jpg\" alt=\"bvcb\" />\n");
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
      out.write("\t\t</table>\n");
      out.write("        <article>\n");
      out.write("        <aside class=\"aside-left-1\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("            <form>\n");
      out.write("            \t<div class=\"content-t\">");
      out.print((String)nowValue[1]);
      out.write("</div>\n");
      out.write("                <div class=\"content-time\">");
      out.print((java.sql.Date)nowValue[3]);
      out.write("</div>\n");
      out.write("                <div class=\"content-c\">\n");
      out.write("              ");
      out.print((String)nowValue[2]);
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"button-pn\">\n");
      out.write("                \t");
if(idx > 1){
      out.write("\n");
      out.write("                    <div class=\"pre-news\">上一則：<a href=\"news_content.jsp?id=");
      out.print((Integer)forwardValue[0]);
      out.write("\" target=\"_self\" title=\"");
      out.print((String)forwardValue[1]);
      out.write('"');
      out.write('>');
      out.print(getTitle((String)forwardValue[1]));
      out.write("</a></div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");
if(idx < newscount){
      out.write("\n");
      out.write("                    <div class=\"next-news\">下一則：<a href=\"news_content.jsp?id=");
      out.print((Integer)backwardValue[0]);
      out.write("\" target=\"_self\" title=\"");
      out.print((String)backwardValue[1]);
      out.write('"');
      out.write('>');
      out.print(getTitle((String)backwardValue[1]));
      out.write("</a></div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </aside>\n");
      out.write("        </article>\n");
      out.write("        <footer></footer>\n");
      out.write("    </div>\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("<script src=\"js/jquery.backgroundPosition.js\"></script>\n");
      out.write("<script src=\"js/cs.js\"></script>\n");
      out.write("<script>\n");
      out.write("(function(){\n");
      out.write("\t\n");
      out.write("\t$(window).resize(function() {\n");
      out.write("\t\t$('article').css({height:$('.content').height()+100});\n");
      out.write("\t}).trigger('resize');\n");
      out.write("\t\n");
      out.write("\t$('.pageButton').css({width:($('.pageNumber').width()+217),marginLeft:-$('.pageButton').width()/2});\n");
      out.write("\t\t\n");
      out.write("})();\n");
      out.write("</script>\n");
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
