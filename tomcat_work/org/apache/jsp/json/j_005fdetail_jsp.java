/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M4
 * Generated at: 2016-11-07 15:21:50 UTC
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

public final class j_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


	public String rentState(int borrow_state){
		String rent = "";
		switch(borrow_state) { 
			case 0: 
				rent = "已歸還"; 
				break;
			case 1: 
				rent = "預約中"; 
				break; 
			case 2: 
				rent = "已超過預約期限"; 
				break; 
			case 3: 
				rent = "借閱中"; 
				break; 
			case 4: 
				rent = "已超過借閱期限，請盡快還書"; 
				break;
			case 5: 
				rent = "已付過罰金"; 
				break;
		} 
		return rent;
	}

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
      out.write('\n');

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
int member_id = 0;
int book_id = 0;
String book_name = "";
String sort = " borrow_id ";
String dir = "desc";
String select_status = "";
String select_data = "";
String date_s = "";
String date_e = "";
String check_fine = "";
String check_state = "";
if(request.getParameter("member_id") != null) member_id = Integer.parseInt((String)request.getParameter("member_id"));
if(request.getParameter("book_id") != null) book_id = Integer.parseInt((String)request.getParameter("book_id"));
if(request.getParameter("book_name") != null) book_name = (String)request.getParameter("book_name");
if(request.getParameter("sort") != null) sort = (String)request.getParameter("sort");
if(request.getParameter("dir") != null) dir = (String)request.getParameter("dir");
if(request.getParameter("select_status") != null) select_status = (String)request.getParameter("select_status");
if(request.getParameter("select_data") != null) select_data = (String)request.getParameter("select_data");
if(request.getParameter("date_s") != null) date_s = (String)request.getParameter("date_s");
if(request.getParameter("date_e") != null) date_e = (String)request.getParameter("date_e");
if(request.getParameter("check_fine") != null) check_fine = (String)request.getParameter("check_fine");
if(request.getParameter("check_state") != null) check_state = (String)request.getParameter("check_state");

  if( member_id !=0 && book_id !=0 && !book_name.equals("")){
		DbBean db = new DbBean();
		List whereList = new ArrayList();
		whereList.add(member_id);  
		whereList.add(book_id);  
		int check_where = 0;
		String total_sql = " select * from ( select * ,F_check_rent_status(borrow_id) as borrow_state,F_get_now_fine(borrow_id) as real_fine,'" + book_name + "' as book_name from borrow_record ) as a  where member_id = ? and book_id = ? ";
		String detail_sql = " select * from ( select * ,F_check_rent_status(borrow_id) as borrow_state,F_get_now_fine(borrow_id) as real_fine,'" + book_name + "' as book_name from borrow_record ) as a where member_id = ? and book_id = ? ";
		if(!select_status.equals("")){	
		 if(select_status.equals("reserve_date") || select_status.equals("reserve_deadline")
			|| select_status.equals("borrow_date") || select_status.equals("borrow_deadline") 
			|| select_status.equals("return_date") ){
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
			} else if(select_status.equals("givefine")){
				if (!check_fine.equals("")) {
					check_where = 1;
                	whereList.add(check_fine);
				}
			} else if(select_status.equals("borrow_state")){
				if (!check_state.equals("")) {
					check_where = 1;
                	whereList.add(check_state);
				}
			}else{
				if (!select_data.equals("")) { 
                	if(select_status.equals("real_fine")){
                		whereList.add(select_data);
                		check_where = 1;
                	}
                }
			}

		}	
		switch(check_where) { 
        case 0: 
			total_sql   += " order by borrow_id "; 
			detail_sql  += " order by  "+sort+" "+dir+"   limit "+start+","+limit;
            break; 
        case 1: 
			total_sql   += " and  "+ select_status +" = ? order by borrow_id "; 
			detail_sql  += " and  "+ select_status +" = ? order by  "+sort+" "+dir+"   limit "+start+","+limit;
            break; 
        case 2: 
			total_sql   += " and  "+ select_status +" < ? order by borrow_id "; 
			detail_sql  += " and  "+ select_status +" < ? order by  "+sort+" "+dir+"   limit "+start+","+limit;
            break; 
        case 3: 
			total_sql   += " and  "+ select_status +" > ? order by borrow_id "; 
			detail_sql  += " and  "+ select_status +" > ? order by  "+sort+" "+dir+"   limit "+start+","+limit;
            break;
        case 4: 
			total_sql   += " and  "+ select_status +"  between ? and ?  order by borrow_id "; 
			detail_sql  += " and  "+ select_status +"  between ? and ?  order by  "+sort+" "+dir+"   limit "+start+","+limit;
            break;           
   		 }
		  //out.println(total_sql);
		 // out.println(detail_sql);
		//if(true) return;
		 List total = db.SelectRSwhere(total_sql,whereList);
		 List ll    = db.SelectRSwhere(detail_sql,whereList);
			out.println("{totalCount:"+total.size()+",result:[");
		for(int i=0;i<ll.size();i++){
			Map map = (Map) ll.get(i); 
				out.println("{");
				String borrow_string = rentState((Integer)map.get( "borrow_state"));
				out.println("seqnum:"+ (i+1) +",");
				out.println("borrow_id:"+pp.replaceBlank(map.get( "borrow_id"))+",");
				out.println("member_id:'"+pp.replaceBlank(map.get( "member_id"))+"',");
				out.println("book_id:'"+pp.replaceBlank(map.get( "book_id"))+"',");
				out.println("book_name:'"+pp.replaceBlank(map.get( "book_name"))+"',");
				out.println("borrow_state:'"+ pp.replaceBlank(map.get( "borrow_state")) +"',");
				out.println("borrow_string:'"+ borrow_string +"',");
				out.println("reserve_date:'"+pp.replaceBlank(map.get( "reserve_date"))+"',");
				out.println("reserve_deadline:'"+pp.replaceBlank(map.get( "reserve_deadline"))+"',");
				out.println("borrow_date:'"+pp.replaceBlank(map.get( "borrow_date"))+"',");
				out.println("borrow_deadline:'"+pp.replaceBlank(map.get( "borrow_deadline"))+"',");
				out.println("return_date:'"+pp.replaceBlank(map.get( "return_date"))+"',");
				out.println("real_fine:'"+ pp.replaceBlank(map.get( "real_fine")) +"',");
				out.println("givefine:'"+pp.replaceBlank(map.get( "givefine"))+"'");
				out.println("}");
				if(i<ll.size()-1)
					out.println(",");
			}
		out.println("]}");
  }

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
