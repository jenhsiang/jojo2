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
	  
		<h2 style="color:#FA5858" align="center" ><font face="Algerian">拉密(Rummikub)</font></h2>
		<table border="0" width="80%" height="350">
			<th width="20%"><img src="pic11.jpg" style="width:300px;height:400px;" align="left">
			
			</th>
			<th width="80%">
			<p align="left" size="32px" style="font-family:Microsoft JhengHei;font-size:120%;">
			<font color="#5F4C0B">
			 @遊戲人數：3~6人<br>
			 @適合年齡：8歲以上 <br>
			 @遊戲時間：30分鐘
			 </font>
			 </p>
			 <p align="left" size="32px" style="font-family:Microsoft JhengHei;font-size:130%;">
			 <font color="#0B615E">
			 *遊戲開始<br>
			 1.大家從牌堆中抽一張牌由數字最大的人開始順時針進行遊戲。<br>
			 2.出合法的牌組，合法牌組一組至少3張以上，並符合以下兩種規則<br>
			　 *同顏色的出順序組，如３４５,５６７８,１２３<br>
			　 *不同顏色的出同樣數字，如６６６<br>
			 3.可以利用桌面上已經出過的牌組重新排列組合讓自己的手牌能夠打出。<br>
			 4.第一次出的牌組稱為破冰，牌組內的數字加起來要>=30，若有合法牌組可出輪到你時但總數<30時不能出牌，必需抽一張牌堆中的牌，並換下一位玩家。破冰出的牌組不能有笑臉百搭牌。<br>
			 5.玩家每一次出牌的時間限制為一分鐘。如果出牌者在一分鐘結束後沒有成功將桌面數字牌重新分配成合法牌組時，就必需將所有數字牌組放回原來的位置，並且還要從桌面上的共用牌堆中再拿三張牌作為懲罰。如果有剩下的數字牌已經不記得原來放的位置則將其放回牌桌上洗牌。<br>
			 6.當自己手牌只剩一張時需喊『拉密』讓別人知道你即將獲勝。有許多小朋友當聽到小密老師說要喊『拉密』時都會問我：『蛤?拉麵?』!小朋友想喊拉麵我也不反對啦!<br>
			
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
