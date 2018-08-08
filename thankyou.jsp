<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%
	String yearString = request.getParameter("year");
	String monthString = request.getParameter("month");
	String dateString = request.getParameter("date");
	String timeToString = request.getParameter("timeTo");
	String timeFromString = request.getParameter("timeFrom");
	String emailString = request.getParameter("email");
	String phoneString = request.getParameter("phone");
	String firstnameString = request.getParameter("firstname");
	String lastnameString = request.getParameter("lastname");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : FootBall   
Description: A two-column, fixed-width design with simple color scheme.
Version    : 1.0
Released   : 20120604
-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>EICA by RTS</title>
<link href="http://fonts.googleapis.com/css?family=Abel|Arvo" rel="stylesheet" type="text/css" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="jquery.dropotron-1.0.js"></script>
</head>
<body>
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header">
			<div id="logo">
				<h1><a href="#">EICA</a></h1>
				<p>England Indoor Cricket Academy</p>
			</div>
		</div>
	</div>
	<!-- end #header -->
	<div id="menu-wrapper">
		<ul id="menu">
			<li><a href="index.html"><span>Homepage</span></a></li>
			<li class="current_page_item"><a href="reservation.jsp"><span>Reservation</span></a></li>
			<li><a href="store.jsp"><span>Store</span></a></li>
			<li><a href="About.html"><span>Abount us</span></a></li>
			
			<!-- 
			<li><span>Links</span>
				<ul>
					<li class="first"> <a href="index">Maecenas luctus lectus</a> </li>
					<li> <a href="search">Integer gravida</a> </li>
					<li class="last"> <a href="about">Ut nonummy rutrum</a> </li>
				</ul>
			</li>
			 -->
			 
			<li><a href="Contact.html"><span>Contact us</span></a></li>
			<li><a href="direction.html"><span>Direction</span></a></li>
		</ul>
		<script type="text/javascript">
			$('#menu').dropotron();
		</script> 
	</div>
	<!-- end #menu -->
	<div id="splash"><img src="images/pics01.jpg" width="980" height="300" alt="" /></div>
	<div id="page">
		<div class="post">
			<h2 class="title"><a href="#">Thank you!</a></h2>
			<div class="entry">
			<p>Thank you <%=firstnameString %> <%=lastnameString %>.</p>
			<p>Your reservation has been made successfully on <%=monthString%>/<%=dateString%>/<%=yearString%> from <%=timeFromString %> to <%=timeToString %>. Please call us in 24 hours to confirm your reservation. Otherwise, we will cancel your reservation automatically.</p>  
			</div>
		</div>
	</div>
</div>
<div id="footer">
	<p>The site is power by <a href="http://www.rtsolinc.com/">RTS</a>.
</div>
<!-- end #footer -->
</body>
</html>