<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Map"%>
<%@ page import="teachDB.DbBean"%>
<%@ page import="org.joda.time.DateTime"%>
<%@ page import="org.joda.time.Period"%>
<%@ page import="org.joda.time.PeriodType"%>
<%!
	public boolean checkReq(Object obj){
		boolean check = false ;
		if(obj != null && !((String)obj).equals("")){
			check = true;
		}
		return check;
	}
	public Object getReq(Object obj){
		Object getS = "";
		if(obj != null){
			getS = (Date) obj;
		}
		return getS;
	}
	public int[] checkrent(int book_id,int member_id,int book_total){
		int[] result = new int[2];
				DbBean db = new DbBean();
				DateTime nowdate = new DateTime();
				DateTime endtime = nowdate.minusDays(1);
				List whereList = new ArrayList();
				whereList.add(book_id);
				whereList.add(member_id);
				whereList.add(nowdate.toString("yyyy-MM-dd HH:mm:ss"));
				whereList.add(endtime.toString("yyyy-MM-dd HH:mm:ss"));	
				List whereList2 = new ArrayList();
				whereList2.add(book_id);
				whereList2.add(member_id);
				whereList2.add(nowdate.toString("yyyy-MM-dd HH:mm:ss"));		
				List duringReserve = db.SelectRSwhere("select * from borrow_record where book_id = ? and member_id = ? and reserve_date <= ? and reserve_deadline >= ? and borrow_date is null and return_date is null and givefine = 0  ",whereList);
				List overReserve   = db.SelectRSwhere("select * from borrow_record where book_id = ? and member_id = ? and reserve_deadline <= ? and borrow_date is null and return_date is null and givefine = 0  ",whereList2);
				List duringRent    = db.SelectRSwhere("select * from borrow_record where book_id = ? and member_id = ? and borrow_date <= ? and borrow_deadline >= ? and  return_date is null and givefine = 0  ",whereList);
				List overRent	   = db.SelectRSwhere("select * from borrow_record where book_id = ? and member_id = ? and borrow_deadline <= ?  and return_date is null and givefine = 0 ",whereList2);
				List checkList = new ArrayList();
				if(duringReserve != null && duringReserve.size() > 0){
					result[0] = 1;
					checkList.addAll(duringReserve);
				}else if(overReserve != null && overReserve.size() > 0){
					result[0] = 2;
					checkList.addAll(overReserve);
				}else if(duringRent != null && duringRent.size() > 0){
					result[0] = 3;
					checkList.addAll(duringRent);
				}else if(overRent != null && overRent.size() > 0){
					result[0] = 4;
					checkList.addAll(overRent);
				}else if(book_total == 0){
					result[0] = 5;
					result[1] = 0;
				}
				if(checkList != null && checkList.size() > 0){
					for ( int j = 0; j < checkList.size(); j++ ) {
						Map map = (Map) checkList.get(j); 	
			        	int borrow_id  = (Integer)map.get("borrow_id");
						result[1] = borrow_id;	
					}
				}
		return result;
	}
	public String rentState(int rent_id){
		String rent = "";
		switch(rent_id) { 
			case 1: 
				rent = "預約中"; 
				break; 
			case 2: 
				rent = "已超過預約期限"; ; 
				break; 
			case 3: 
				rent = "借閱中"; ; 
				break; 
			case 4: 
				rent = "已超過借閱期限，請盡快還書"; ; 
				break;
			case 5: 
				rent = "書都借光光了，下次請早!"; ; 
				break; 
		} 
		return rent;
	}
	public int getFine(int givefine,int fine,int rent_mark,Object reserve_deadline,Object borrow_deadline){
		int money = 0;
		if(givefine == 1){
			money = fine;
		}else if(rent_mark == 2 || rent_mark == 4){
			DateTime get_deadline = null;
			if(rent_mark == 2 && reserve_deadline != null ){
				get_deadline = new DateTime((Date)reserve_deadline).plusDays(1);
			}else if(rent_mark == 4 && borrow_deadline != null ){
				get_deadline = new DateTime((Date)borrow_deadline).plusDays(1);
			}
			if(get_deadline != null){
				DateTime nowdate = new DateTime();
				Period p = new Period(get_deadline, nowdate, PeriodType.days());
				money = 2 * p.getDays();
			}	
		}
		return money;
	}
%>
<%
	request.setCharacterEncoding("UTF-8");
	DbBean  db = new DbBean();
	String firstchoice  = "類別";
	int    secondchoice = 0 ;
	String bookname   = "" ;
	if(checkReq(request.getParameter("firstchoice"))){
		firstchoice = (String)request.getParameter("firstchoice");
	}
	if(checkReq(request.getParameter("secondchoice"))){
		secondchoice = Integer.parseInt((String)request.getParameter("secondchoice"));
	}
	if(checkReq(request.getParameter("bookname"))){
		bookname = (String)request.getParameter("bookname").replaceAll("\\s+", "");
	}
%>
<html  ng-app="app" ng-controller= "mainCrtl">
<head>
<style>
.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>天天學桌遊</title>
<link href="style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="modaal.css" media="screen">
<script src="js/angular.js"></script>
<script src="js/book.js"></script>
</head>
<body > 
		
		<p style="color:#088A85" align="center" ><font face="Algerian" size="500">GAMEBOARD WORLD</font><a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/"  target="_blank" ><img src="fb.png" style="width:50px;height:40px;" align="right"></a>
		<a href="https://www.facebook.com/%E5%A4%A9%E5%A4%A9%E5%AD%B8%E6%A1%8C%E9%81%8A-1118376901610135/"  target="_blank" ><img src="in.png" style="width:50px;height:40px;" align="right"></a></p>
		<hr>
		<%@ include file = "/_include/menu.jsp"%>
		
	<div id="tfheader">
		<form id="tfnewsearch" action = "book.jsp"  method="post" ng-init="setFirst('<%=firstchoice%>','<%=secondchoice%>');">
		<input type="hidden" name="firstchoice" id="firstchoice" value="{{add_first}}">
		<input type="hidden" name="secondchoice" id="secondchoice" value="{{add_second.search_id}}">
		<select class="city" ng-model="add_first" ng-options="name.search_type as name.search_type for name in firstName"  ng-change="getFirst();">
		</select>
		<select class="town" ng-model="add_second" ng-options="name as name.search_name for name in setSecondName" >
		</select>
		        <input type="text" class="tftextinput"  id = "bookname" name = "bookname"  size="21" maxlength="120" value="<%=bookname%>">

				<input type="submit" value="search" class="tfbutton">
		</form>
	<div class="tfclear"></div>
	  </div>
	  <center>
	  
		
		<h2 style="color:#00b36b" align="center" ><font face="Algerian">OUR SHOP</font></h2>
        <table width="90%" bgcolor="#CEF6EC" border="1" BORDERCOLOR=white style="border-collapse: collapse;" style="border: 1px solid black;">
			<tr>
			<th>
			<li>
				<div style="float: left;">
					<a href="index3-9.jsp"><img src="img/pic15.jpg" alt="盜夢都市" id="itemImg" width="200" height="250"></a>
				</div>
				<div style="float: left;">
					<H2 style="color:BLUE;">盜夢都市(Inception)</H2>
					<p style="color:BLACK;">人數：4-8人</p>
					<p style="color:BLACK;">作者： 千智</p>
					<p style="color:BLACK;">類別：輕度策略</p>
					<p style="color:BLACK;">Price: 600 NTD</p>
					<p><a href="index3-9.jsp" style="color:blue;">MORE</a></p>
				</div>
				<div style="float: none; clear: both;"></div>
				
			</li>
			<li>
				<div style="float: left;">
					<a href="index3-10.jsp"><img src="img/pic16.jpg" alt="泥巴大戰" id="itemImg" width="200" height="250"></a>
				</div>
				<div style="float: left;">
					<H2 style="color:BLUE;">泥巴大戰(Matschig)</H2>
					<p style="color:BLACK;">人數：3~10人</p>
					<p style="color:BLACK;">作者：Valentin Herman</p>
					<p style="color:BLACK;">類別：派對遊戲</p>
					<p style="color:BLACK;">Price: 490 NTD</p>
					<p><a href="index3-1.jsp" style="color:blue;">MORE</a></p>
				</div>
				<div style="float: none; clear: both;"></div>				
</li>
<li>
    <div style="float: left;">
        <a href="index3-11.jsp"><img src="img/pic17.jpg" alt="七吃九" id="itemImg" width="200" height="250"></a>
    </div>
    <div style="float: left;">
        <H2 style="color:BLUE;">七吃九(7Eat9)</H2>
        <p style="color:BLACK;">人數：2~4人</p>
        <p style="color:BLACK;">作者：Maureen Hiron</p>
		<p style="color:BLACK;">類別：派對遊戲</p>
					<p style="color:BLACK;">Price: 490 NTD</p>
        <p><a href="index3-11.jsp" style="color:blue;">MORE</a></p>
    </div>
    <div style="float: none; clear: both;"></div>
	
</li>
</th>
</tr>
</table>
<table width="90%" bgcolor="WHITE" border="1" BORDERCOLOR=#00b36b style="border-collapse: collapse;" style="border: 1px solid black;">
			<tr>
			<th>
			<li>
				<div style="float: left;">
					<a href="index3-12.jsp"><img src="img/pic18.jpg" alt="諾亞方舟(NoahARK)" id="itemImg" width="200" height="250"></a>
				</div>
				<div style="float: left;">
					<H2 style="color:BLUE;">諾亞方舟(NoahARK)</H2>
					<p style="color:BLACK;">人數：1~6人</p>
					<p style="color:BLACK;">作者：No name</p>
					<p style="color:BLACK;">類別：派對遊戲</p>
					<p style="color:BLACK;">Price: 1520 NTD</p>
					<p><a href="index3-12.jsp" style="color:blue;">MORE</a></p>
				</div>
				<div style="float: none; clear: both;"></div>
				
			</li>
			<li>
				<div style="float: left;">
					<a href="index3-13.jsp"><img src="img/pic19.jpg" alt="牛頭王(Take6)" id="itemImg" width="200" height="250"></a>
				</div>
								<div style="float: left;">
					<H2 style="color:BLUE;">牛頭王(Take6)</H2>
					<p style="color:BLACK;">人數：2~10人</p>
					<p style="color:BLACK;">作者：wolfgang kramer</p>
					<p style="color:BLACK;">類別：派對遊戲</p>
					<p style="color:BLACK;">Price: 490 NTD</p>
					<p><a href="index3-13.jsp" style="color:blue;">MORE</a></p>
				</div>
				<div style="float: none; clear: both;"></div>
				
</li>
<li>
    <div style="float: left;">
        <a href="index3-14.jsp"><img src="img/pic20.jpg" alt="空中之城(Celestia)" id="itemImg" width="200" height="250"></a>
    </div>
    				<div style="float: left;">
					<H2 style="color:BLUE;">空中之城(Celestia)</H2>
					<p style="color:BLACK;">人數：2~6人</p>
					<p style="color:BLACK;">作者：Thies Schwarz</p>
					<p style="color:BLACK;">類別：家庭遊戲</p>
					<p style="color:BLACK;">Price: 1000 NTD</p>
					<p><a href="index3-14.jsp" style="color:blue;">MORE</a></p>
				</div>
				<div style="float: none; clear: both;"></div>
	
</li>
</th>
</tr>
</table>
<table width="90%" bgcolor="#CEF6EC" border="1" BORDERCOLOR=white style="border-collapse: collapse;" style="border: 1px solid black;">
			<tr>
			<th>
			<li>
				<div style="float: left;">
					<a href="index3-15.jsp"><img src="img/pic21.jpg" alt="殭屍商場(MallofHorror)" id="itemImg" width="200" height="250"></a>
				</div>
								<div style="float: left;">
					<H2 style="color:BLUE;">殭屍商場(MallHorror)</H2>
					<p style="color:BLACK;">人數：2~4人</p>
					<p style="color:BLACK;">作者：Nicolas Normandon</p>
					<p style="color:BLACK;">類別：家庭遊戲</p>
					<p style="color:BLACK;">Price: 1500 NTD</p>
					<p><a href="index3-15.jsp" style="color:blue;">MORE</a></p>
				</div>
				<div style="float: none; clear: both;"></div>
				
			</li>
			<li>
				<div style="float: left;">
					<a href="index3-16.jsp"><img src="img/pic22.jpg" alt="糟了個糕" id="itemImg" width="200" height="250"></a>
				</div>
								<div style="float: left;">
					<H2 style="color:BLUE;">糟了個糕</H2>
					<p style="color:BLACK;">人數：2~6人</p>
					<p style="color:BLACK;">作者：Michael Kiesling</p>
					<p style="color:BLACK;">類別：派對遊戲</p>
					<p style="color:BLACK;">Price: 1500 NTD</p>
					<p><a href="index3-16.jsp" style="color:blue;">MORE</a></p>
				</div>
				<div style="float: none; clear: both;"></div>
				
</li>
<li>
    <div style="float: left;">
        <a href="index3-17.jsp"><img src="img/pic23.jpg" alt="馬尼拉" id="itemImg" width="200" height="250"></a>
    </div>
    				<div style="float: left;">
					<H2 style="color:BLUE;">馬尼拉(Manila)</H2>
					<p style="color:BLACK;">人數：3~5人</p>
					<p style="color:BLACK;">作者：Franz-Benno Delonge</p>
					<p style="color:BLACK;">類別：派對遊戲</p>
					<p style="color:BLACK;">Price: 1490 NTD</p>
					<p><a href="index3-17.jsp" style="color:blue;">MORE</a></p>
				</div>
				<div style="float: none; clear: both;"></div>
	
</li>
</th>
</tr>
</table>

</center>
<div class="container">
  <h2>Pager</h2>
  <ul class="pager">
    <li><a href="index4.jsp">1</a></li>
    <li><a href="index4-1.jsp">2</a></li>
	<li><a href="index4-2.jsp">3</a></li>
	<li><a href="index4-3.jsp">4</a></li>
	<li><a href="index4-4.jsp">5</a></li>
	<li><a href="index4-5.jsp">6</a></li>
	<li><a href="index4-6.jsp">»</a></li>
  </ul>
</div>
</body>
</html>
