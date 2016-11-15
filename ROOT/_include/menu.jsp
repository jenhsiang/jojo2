<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=UTF-8"%>
<html>
<head>
<style >
h1 {
    font-size: 700%;
	
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #0B615E;
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
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}
</style>
</head>
<body>
<center>
<table style="border: 0px solid #0B614B;" style="width:100%">
	<tr>
	<th>
	<image src=LOGODC2.png width="100px" height="90">
	</th>
		<th>
		

			<ul>
				  
				  <li><a class="active" href="index.jsp" target="_self">Home</a></li>
				  <li><a href="index4.jsp" target="_self">Shop</a></li>
				  <li><a href="book.jsp" target="_self">Order</a></li>
				  
				  <li><a href="contact.jsp" target="_self">Contact us</a></li>
				  <li><a href="video.jsp" target="_self">Video</a></li>
				  <li class="m-5"><a href="rent.jsp" target="_self">Status</a></li>
				  <li style="float:right"><a href="register.jsp" target="_self">Sign up</a></li>
				  <li class="m-7"><a href="login.jsp" target="_self">
				<%	if ( session.getAttribute ("member_name") != null) {%>
				MODIFY
				<%} else {%>
				Sign in
				<%}%>
				</a></li>
				<%	if ( session.getAttribute ("member_name") != null) {%>
				<li class="m-8"><a href="logout.jsp" target="_self">Log out</a></li>
				<%}%>
			</ul>
				
        

</th>
</table>
</center>
</body>
</html>