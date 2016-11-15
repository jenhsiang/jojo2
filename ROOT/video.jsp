<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Map"%>
<%@ page import="teachDB.DbBean" %>
<%@ page import="StringFormat.pattern" %>
<%!
 private String  getTitle(String title){
 		String shortString = "";
       		if(title.length() > 20)
       			shortString = title.substring(0,20)+"...";
       		else
       			shortString = title;
       		return 	shortString;
        }
%>
<%
	DbBean db = new DbBean();
	List showNews = db.SelectRS("select * from newslist where deleteflag = 0 order by n_order ");
	String[] NewsAll;
	String[] NewsArray;
	String[] NewsIdx;
	if(showNews.size() > 6 ){
		NewsAll = new String[6];
		NewsArray = new String[6];
		NewsIdx = new String[6];
	}else{
		NewsAll = new String[showNews.size()];
		NewsArray = new String[showNews.size()];
		NewsIdx = new String[showNews.size()];
		}
	for(int i=0;i<NewsArray.length;i++){
		Map map = (Map) showNews.get(i);
			NewsAll[i] =(String) map.get( "n_title");
			NewsArray[i] =getTitle((String) map.get( "n_title"));
			NewsIdx[i] = String.valueOf((Integer)map.get( "n_id"));	
	}
%>
<!doctype html>
<html>
<head>
<style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
h1 {
    font-size: 700%;
	
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
    border-right:1px solid #bbb;
}

li:last-child {
    border-right: none;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 13px 15px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #CEF6CE;
}

.active {
    background-color: white;
}
</style>
<title>天天學桌遊</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
    
		<p style="color:#088A85" align="center" ><font face="Algerian" size="500">GAMEBOARD WORLD</font><a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/"  target="_blank" ><img src="fb.png" style="width:50px;height:40px;" align="right"></a>
		<a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/"  target="_blank" ><img src="in.png" style="width:50px;height:40px;" align="right"></a></p>
		<hr WIDTH="80%">
      <%@ include file = "/_include/menu.jsp"%>
	  <center>
	  
		<h2 style="color:#00b36b" align="center" ><font face="Algerian">TUTORIAL VIDEO</font></h2>
        <table style="width:80%" border="1" BORDERCOLOR=#00994d>
			  <tr>
			    <th style="width:25%" >
					<iframe width="420" height="345" src="https://www.youtube.com/embed/MT_vTsehJO8"></iframe>
					<p>
					妙語說書人(DIXIT).
					<a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/" target="_blank">FACEBOOK</a>
					</p>
				</th>
			    <th style="width:25%" >
					<iframe width="420" height="345" src="https://www.youtube.com/embed/49mthp7IuRg"></iframe>
					<p>
					妙語說書人(DIXIT).
					<a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/" target="_blank">FACEBOOK</a>
					</p>
				</th>
				<th style="width:25%" >
					<iframe width="420" height="345" src="https://www.youtube.com/embed/uhBLUqmQYZI"></iframe>
					<p>
					妙語說書人(DIXIT).
					<a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/" target="_blank">FACEBOOK</a>
					</p>
				</th>
				<tr>
			    <th style="width:25%" >
					<iframe width="420" height="345" src="https://www.youtube.com/embed/wONwv84AY5Y"></iframe>
					<p>
					妙語說書人(DIXIT).
					<a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/" target="_blank">FACEBOOK</a>
					</p>
				</th>
			    <th style="width:25%" >
					<iframe width="420" height="345" src="https://www.youtube.com/embed/zRaXEpV7mDo"></iframe>
					<p>
					妙語說書人(DIXIT).
					<a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/" target="_blank">FACEBOOK</a>
					</p>
				</th>
				<th style="width:25%" >
					<iframe width="420" height="345" src="https://www.youtube.com/embed/7gNMZw8Puy0"></iframe>
					<p>
					妙語說書人(DIXIT).
					<a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/" target="_blank">FACEBOOK</a>
					</p>
				</th>
			  </tr>
		</table>
		

</center>
</body>
</html>
