/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M4
 * Generated at: 2016-11-11 13:39:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.json;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Date;
import teachDB.DbBean;
import StringFormat.pattern;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;

public final class j_005fa_005frecommend_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("StringFormat.pattern");
    _jspx_imports_classes.add("org.joda.time.Period");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("teachDB.DbBean");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.joda.time.DateTime");
    _jspx_imports_classes.add("org.joda.time.PeriodType");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

pattern pp = new pattern();
//System.out.println(pp.replaceBlank(test));
int start = 0;
		try {
		    start = Integer.parseInt(request.getParameter("start"));
		} catch(Exception ex) {
		    System.err.println(ex);
		}
		int limit = 20;
		try {
		    limit = Integer.parseInt(request.getParameter("limit"));
		} catch(Exception ex) {
		    System.err.println(ex);
		}

String sort = " recommend_id ";
String dir = "asc";
String select_status = "";
String select_data = "";
String date_s = "";
String date_e = "";
String check_userid = "";
if(request.getParameter("sort") != null) sort = (String)request.getParameter("sort");
if(request.getParameter("dir") != null) dir = (String)request.getParameter("dir");
if(request.getParameter("select_status") != null) select_status = (String)request.getParameter("select_status");
if(request.getParameter("select_data") != null) select_data = (String)request.getParameter("select_data");
if(request.getParameter("date_s") != null) date_s = (String)request.getParameter("date_s");
if(request.getParameter("date_e") != null) date_e = (String)request.getParameter("date_e");
if(request.getParameter("check_userid") != null) check_userid = (String)request.getParameter("check_userid");

		DbBean db = new DbBean();
		List whereList = new ArrayList(); 
		int check_where = 0;
		String total_sql  = " select * from  recommend ";
		String detail_sql = " select * from  recommend ";
		if(!select_status.equals("")){	
		 if(select_status.equals("createtime") || select_status.equals("updatetime") ){
           	 if (date_s.equals("") && date_e.equals("")) { 
           		 check_where  = 0;
                } else if (date_s.equals("")) { 
                	check_where = 2;
                	whereList.add(date_e);   	
                } else if (date_e.equals("")) {
                	check_where = 3;
                	whereList.add(date_s); 	
                } else {
                	check_where = 4;
                	whereList.add(date_s);
                	whereList.add(date_e);  	
                }
			} else if(select_status.equals("a_userid")){
				if (!check_userid.equals("")) {
					check_where = 1;
                	whereList.add(check_userid);
				}
			}else{
				if (!select_data.equals("")) { 
                	if(select_status.equals("recommend_name")){
                		whereList.add(select_data);
                		check_where = 1;
                	}
                }
			}

		}	
		switch(check_where) { 
        case 0: 
			total_sql   += " order by recommend_id "; 
			detail_sql  += " order by  "+sort+" "+dir+"   limit "+start+","+limit;
            break; 
        case 1: 
			total_sql   += " where  "+ select_status +" = ? order by recommend_id "; 
			detail_sql  += " where  "+ select_status +" = ? order by  "+sort+" "+dir+"   limit "+start+","+limit;
            break; 
        case 2: 
			total_sql   += " where  "+ select_status +" < ? order by recommend_id "; 
			detail_sql  += " where  "+ select_status +" < ? order by  "+sort+" "+dir+"   limit "+start+","+limit;
            break; 
        case 3: 
			total_sql   += " where  "+ select_status +" > ? order by recommend_id "; 
			detail_sql  += " where  "+ select_status +" > ? order by  "+sort+" "+dir+"   limit "+start+","+limit;
            break;
        case 4: 
			total_sql   += " where  "+ select_status +"  between ? and ?  order by recommend_id "; 
			detail_sql  += " where  "+ select_status +"  between ? and ?  order by  "+sort+" "+dir+"   limit "+start+","+limit;
            break;           
   		 }
		  //out.println(total_sql);
		 // out.println(detail_sql);
		//if(true) return;
		 List total = null;
		 List ll    = null;
		 if(check_where == 0){
			 total = db.SelectRS(total_sql);
			 ll    = db.SelectRS(detail_sql);
		 }else {
			 total = db.SelectRSwhere(total_sql,whereList);
			 ll    = db.SelectRSwhere(detail_sql,whereList);
		 }
			
			out.println("{totalCount:"+total.size()+",result:[");
		for(int i=0;i<ll.size();i++){
			Map map = (Map) ll.get(i); 
				out.println("{");
				out.println("seqnum:"+ i +",");
				out.println("recommend_id:"+pp.replaceBlank(map.get( "recommend_id"))+",");
				out.println("recommend_name:'"+pp.replaceBlank(map.get( "recommend_name"))+"',");
				out.println("a_userid:'"+pp.replaceBlank(map.get( "a_userid"))+"',");
				out.println("createtime:'"+pp.replaceBlank(map.get( "createtime"))+"',");
				out.println("updatetime:'"+ pp.replaceBlank(map.get( "updatetime")) +"'");
				out.println("}");
				if(i<ll.size()-1)
					out.println(",");
			}
		out.println("]}");


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
