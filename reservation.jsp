<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%
	int startingTime = 9;
	int endingTime = 18;
   Calendar cal = Calendar.getInstance();
	String month[] = {"Jan", "Feb", "May", "Apr", "Mar", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	String time[] = {"Date","9am","10am","11am","12pm","1pm","2pm","3pm","4pm","5pm","6pm"};
	String yearString = request.getParameter("year");
	String monthString = request.getParameter("month");
	String offsetString = request.getParameter("offset");
	if(yearString != null){
		int yearToSet = Integer.parseInt(request.getParameter("year"));
		cal.set(Calendar.YEAR, yearToSet);
	}
	if(monthString != null){
		int monthToSet = Integer.parseInt(request.getParameter("month"));
		cal.set(Calendar.MONTH, monthToSet);
	}
	if(offsetString != null){
		int offset = Integer.parseInt(request.getParameter("offset"));
		cal.add(Calendar.MONTH, offset);
	}
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
			<li class="current_page_item"><a href="#"><span>Reservation</span></a></li>
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
			<h2 class="title"><a href="#">Reserve:</a></h2>
			<div class="entry">
			<!-- the header for calendar part -->
				<table border="0">
					<tr>
						<th>
							<form name="input" method="get">
								<input type="hidden" name="year" value="<%=cal.get(Calendar.YEAR) %>"/>
								<input type="hidden" name="month" value="<%=cal.get(Calendar.MONTH) %>"/>
								<input type="hidden" name="offset" value="-1"/>
								<p><input type="submit" value="Previous Month" /></p>
							</form> 
						</th>
						<th><font size="22"> <%=month[(cal.get(Calendar.MONTH))]%>&nbsp<%=cal.get(Calendar.YEAR) %> </font></th>
						<th>
							<form name="input" method="get">
								<input type="hidden" name="year" value="<%=cal.get(Calendar.YEAR) %>"/>
								<input type="hidden" name="month" value="<%=cal.get(Calendar.MONTH) %>"/>
								<input type="hidden" name="offset" value="1"/>
								<p><input type="submit" value="Next Month" /></p>
							</form> 
						</th>
					</tr>
				</table> 
				
				<!-- the body of calendar -->
				<table>
				<tr>
				<td valign="top" align="right" >
				<table border = "1" >
				<tr><td><p><%=time[0]%></p></td></tr>
				<tr><td><p><%=time[1]%></p></td></tr>
				<tr><td><p><%=time[2]%></p></td></tr>
				<tr><td><p><%=time[3]%></p></td></tr>
				<tr><td><p><%=time[4]%></p></td></tr>
				<tr><td><p><%=time[5]%></p></td></tr>
				<tr><td><p><%=time[6]%></p></td></tr>
				<tr><td><p><%=time[7]%></p></td></tr>
				<tr><td><p><%=time[8]%></p></td></tr>
				<tr><td><p><%=time[9]%></p></td></tr>
				<tr><td><p><%=time[10]%></p></td></tr>
				</table>
				</td>
				<td valign="top" align="left">
					<div id="calendar-table">
					<table border="1">
						<% for(int i=0; i<time.length; i++){%>
							<tr>
							<% for(int j=0; j<= cal.getActualMaximum(Calendar.DAY_OF_MONTH); j++){%>
								<%if(j==0){ %>
								
								<!--  it is already handled by previous table
								<td>
								<p><%=time[i]%></p>
								</td>
								 -->
								<%} else if(i==0){%>
								<td>
								<p> <%=j %></p>
								</td>
								<%} else{%>
								<%if(i==3 && j == 4){ %>
								<td bgcolor="#FFA500">
								<p>Booked</p>
								</td>
								<%} else if(i==5 && j == 7){%>
								<td bgcolor="#FF0000">
								<p>Reserved</p>
								</td>
								<%} else{ %>
								<td bgcolor="#008000">
								<form name="calendar" action="reservationInfo.jsp" method="get" onsubmit="return confirm('Are you sure you want to make a reservation?')">
									<input type="hidden" name="year" value="<%=cal.get(Calendar.YEAR) %>"/>
									<input type="hidden" name="month" value="<%=cal.get(Calendar.MONTH)+1 %>"/>
									<input type="hidden" name="date" value="<%=j %>"/>
									<input type="hidden" name="timeindex" value="<%=i %>"/>
									<input type="hidden" name ="time" value="<%=time[i]%>"/>
									<p><input type="submit" value="Reserve" /></p>
								</form> 
								</td>
								<%} %>
								<%} %>
							<% }%>	
								
							</tr>
						<%}%>
					</table> 
					</div>
					</td>
					</tr>
					</table>
			</div>
		</div>
	</div>
</div>
<div id="footer">
	<p>The site is power by <a href="http://www.rtsolinc.com/">RTS</a>. </p>
</div>
<!-- end #footer -->
</body>
</html>