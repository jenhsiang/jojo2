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
    
		<p style="color:#00331f" align="center" ><font face="Algerian" size="500">GAMEBOARD WORLD</font><a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/"  target="_blank" ><img src="fb.png" style="width:50px;height:40px;" align="right"></a>
		<a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/"  target="_blank" ><img src="in.png" style="width:50px;height:40px;" align="right"></a></p>
		<hr WIDTH="80%">
      <%@ include file = "/_include/menu.jsp"%>
	  <center>
	  <table>
		<tr>
		<div class="w3-content w3-section" style="max-width:1000px">
		  <img class="mySlides" height="400" src="banner.jpg" style="width:80%">
		  <img class="mySlides" height="400" src="bg1.jpg" style="width:80%">
		  <img class="mySlides" height="400" src="gameboardbg.jpg" style="width:80%">
		</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}
    x[myIndex-1].style.display = "block";
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
		</tr>
		</table>
		<h2 style="color:#00b36b" align="center" ><font face="Algerian">NEWS</font></h2>
		<table style="width:40%" height="350" BORDER="0">
  <tr>
    <td><a href="https://www.facebook.com/EverydayBoardgame/?pnref=story"  target="_blank" ><img src="news1.jpg" style="width:400px;height:400px;"></a></td>
    
    <td><a href="https://www.facebook.com/events/701478853337224/"  target="_blank" ><img src="news2.jpg" style="width:400px;height:400px;"></a></td>
  </tr>
</table>

		<HR width="80%" align="CENTER">
		<h2 style="color:#00b36b" align="center" ><font face="Algerian">RECOMMEND</font></h2>
        <table bgcolor="#CEF6EC" border="1" BORDERCOLOR=white style="border-collapse: collapse;" style="border: 1px solid black;">
			<tr>
			<th>
			<li>
				<div style="float: left;">
					<a href="index3.jsp"><img src="pic6.jpg" alt="妙語說書人" id="itemImg" width="200" height="250"></a>
				</div>
				<div style="float: left;">
					<H2 style="color:BLUE;">妙語說書人</H2>
					<p style="color:BLACK;">Price : 1200 NTD</p>
					<p style="color:BLACK;">Year : 2008</p>
					<p><a href="index3.jsp" style="color:blue;">MORE</a></p>
				</div>
				<div style="float: none; clear: both;"></div>
				
			</li>
			<li>
				<div style="float: left;">
					<a href="index3-1.jsp"><img src="pic9.jpg" alt="矮人礦坑" id="itemImg" width="200" height="250"></a>
				</div>
				<div style="float: left;">
					<H2 style="color:BLUE;">矮人礦坑</H2>
					<p style="color:BLACK;">Price : NTD</p>
					<p style="color:BLACK;">Year : 2004</p>
					<p><a href="index3-1.jsp" style="color:blue;">MORE</a></p>
				</div>
				<div style="float: none; clear: both;"></div>
				
</li>
<li>
    <div style="float: left;">
        <a href="index3-2.jsp"><img src="pic10.jpg" alt="驢橋" id="itemImg" width="200" height="250"></a>
    </div>
    <div style="float: left;">
        <H2 style="color:BLUE;">驢橋</H2>
        <p style="color:BLACK;">Price : NTD</p>
        <p style="color:BLACK;">Year : 2011</p>
        <p><a href="index3-2.jsp" style="color:blue;">MORE</a></p>
    </div>
    <div style="float: none; clear: both;"></div>
	
</li>
</th>
</tr>
</table>

</center>
</body>
</html>
