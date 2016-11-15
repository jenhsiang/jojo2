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
	  
		<h2 style="color:#FA5858" align="center" ><font face="Algerian">卡卡頌(Carcassonne)</font></h2>
		<table border="0" width="80%" height="350">
			<th width="20%"><img src="pic4.jpg" style="width:300px;height:400px;" align="left">
			
			</th>
			<th width="80%">
			<p align="left" size="32px" style="font-family:Microsoft JhengHei;font-size:120%;">
			<font color="#5F4C0B">
			 @遊戲人數：2~5人<br>
			 @適合年齡：8歲以上 <br>
			 @遊戲時間：40分鐘
			 </font>
			 </p>
			 <p align="left" size="32px" style="font-family:Microsoft JhengHei;font-size:130%;">
			 <font color="#0B615E">
			 *遊戲開始<br>
			 -卡卡頌是位於法國南部的一座美麗古城，也是中古時代教會對抗異教徒的重鎮，設計師在一次的旅行中到了卡卡頌，因而有了設計一款簡易策略遊戲的想法，於是在西元2000年設計了此款，也是Klaus-Jürgen Wrede的第一款遊戲，沒想到受到相當大的歡迎，所有玩過一次的人幾乎都會愛上它，卡卡頌在隔年2001年就獲得了德國最佳遊戲獎的殊榮，直到今天它的人氣依然不減。<br>
						
			
			
			</font>
			</p>
			</th>
		
		</table>
		<h2 style="color:blue" align="center" style="font-family:Microsoft JhengHei;">教學影片</h2>
		<table>
		<tr>
			<th style="width:25%" >
					<iframe width="70%" height="600" src="http://www.youtube.com/embed/W7qWa52k-nE"></iframe>
					<p>
					<a href="video.jsp"><font color="blue">MORE</font></a>
					</p>
			</th>
		</tr>
		</table>
		 <a href="https://www.facebook.com/EverydayBoardgame/"><font color="blue" target="_blank">here</font></a> to go to <a href="https://www.facebook.com/EverydayBoardgame/" target="_blank"><font color="blue">Facebook.</font></a>
</center>
</body>
</html>
