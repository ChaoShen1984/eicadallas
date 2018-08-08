<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%
   String result;
   // Recipient's email ID needs to be mentioned.
   String to = "chaoshenopt@gmail.com";

   // Sender's email ID needs to be mentioned
   String from = "waitmyloving@gmail.com";

   // Assuming you are sending email from localhost
   //String host = "smtp.gmail.com";

   String firstName = request.getParameter("firstname");
   
   String lastName = request.getParameter("lastname");
   
   String phone = request.getParameter("phone");
   
   String email = request.getParameter("email");
   
   String messageBody = request.getParameter("message");
   // Get system properties object
   Properties properties = System.getProperties();

   // Setup mail server
   //properties.setProperty("mail.smtp.host", host);
   
   //properties.setProperty("mail.user", "waitmyloving@gmail.com");
   //properties.setProperty("mail.password", "19840915");

   // Get the default Session object.
   Session mailSession = Session.getDefaultInstance(properties, null);

   try{
      // Create a default MimeMessage object.
      MimeMessage message = new MimeMessage(mailSession);
      // Set From: header field of the header.
      message.setFrom(new InternetAddress(from));
      // Set To: header field of the header.
      message.addRecipient(Message.RecipientType.TO,
                               new InternetAddress(to));
      // Set Subject: header field
      message.setSubject("EICA Customer Message");
     
      // Send the actual HTML message, as big as you like
      message.setContent("<h1>EICA Customer Message</h1> <p>Customer name:" + firstName + " " + lastName + "</p> <p>Customer Phone: " + phone +  "</p> <p>Customer Email: " + email + "</p> <p>Message: <br/>" + messageBody + "</p>" , "text/html" );
      // Send message
      //Transport transport=mailSession.getTransport("smtp");
      //transport.connect(host,"waitmyloving@gmail.com","19840915");
      //transport.sendMessage(message,message.getAllRecipients());
      //transport.close();
      Transport.send(message);
      result = "Sent message successfully....";
   }catch (MessagingException mex) {
      mex.printStackTrace();
      result = "Error: unable to send message....";
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
			<li><a href="reservation.jsp"><span>Reservation</span></a></li>
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
			 
			<li class="current_page_item"><a href="Contact.html"><span>Contact us</span></a></li>
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
			<h2 class="title"><a href="#">Form submitted Result</a></h2>
			<div class="entry">
				<% 
			   		out.println(result + "\n");
				%>
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