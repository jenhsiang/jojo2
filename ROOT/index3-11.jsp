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
	  
		<h2 style="color:#FA5858" align="center" ><font face="Algerian">七吃九(7Eat9)</font></h2>
		<table border="0" width="80%" height="350">
			<th width="20%"><img src="img/pic17.jpg" style="width:300px;height:400px;" align="left">
			
			</th>
			<th width="80%">
			<p align="left" size="32px" style="font-family:Microsoft JhengHei;font-size:120%;">
			<font color="#5F4C0B">
			 @遊戲人數：4~8人<br>
			 @適合年齡：15歲以上 <br>
			 @遊戲時間：約5-10分
			 </font>
			 </p>
			 <p align="left" size="32px" style="font-family:Microsoft JhengHei;font-size:130%;">
			 <font color="#0B615E">
			 *遊戲開始<br>
			 是一款結合反應和數學計算的遊戲且搭配數學進位和補位的概念遊戲方式很簡單但是卻充滿緊張和趣味<br>
			 適合當學會加法和減法的小朋友使用<br>
			 這遊戲和數1、2、3一樣簡單！玩家們要把牌堆最上面的紙牌加減1、2或3，如果他們手上有一樣數字的牌，就可以打出來。這聽起來很簡單，但是遊戲過程中可是全部的玩家同時搶著出牌，所以可以出牌的會一直改變，動作慢了點，可就沒得出囉！第一個將紙牌出完的人獲勝！<br>
			
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
