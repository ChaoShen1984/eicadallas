package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class email_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n\r\n");

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

      out.write("\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n<!--\r\nDesign by Free CSS Templates\r\nhttp://www.freecsstemplates.org\r\nReleased for free under a Creative Commons Attribution 2.5 License\r\n\r\nName       : FootBall   \r\nDescription: A two-column, fixed-width design with simple color scheme.\r\nVersion    : 1.0\r\nReleased   : 20120604\r\n-->\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta name=\"keywords\" content=\"\" />\r\n<meta name=\"description\" content=\"\" />\r\n<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n<title>EICA by RTS</title>\r\n<link href=\"http://fonts.googleapis.com/css?family=Abel|Arvo\" rel=\"stylesheet\" type=\"text/css\" />\r\n<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\r\n<script type=\"text/javascript\" src=\"jquery-1.7.1.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"jquery.dropotron-1.0.js\"></script>\r\n</head>\r\n<body>\r\n<div id=\"wrapper\">\r\n\t<div id=\"header-wrapper\">\r\n\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n\t\t\t\t<h1><a href=\"#\">EICA</a></h1>\r\n\t\t\t\t<p>England Indoor Cricket Academy</p>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t</div>\r\n\t<!-- end #header -->\r\n\t<div id=\"menu-wrapper\">\r\n\t\t<ul id=\"menu\">\r\n\t\t\t<li><a href=\"index.html\"><span>Homepage</span></a></li>\r\n\t\t\t<li><a href=\"reservation.jsp\"><span>Reservation</span></a></li>\r\n\t\t\t<li><a href=\"store.jsp\"><span>Store</span></a></li>\r\n\t\t\t<li><a href=\"About.html\"><span>Abount us</span></a></li>\r\n\t\t\t\r\n\t\t\t<!-- \r\n\t\t\t<li><span>Links</span>\r\n\t\t\t\t<ul>\r\n\t\t\t\t\t<li class=\"first\"> <a href=\"index\">Maecenas luctus lectus</a> </li>\r\n\t\t\t\t\t<li> <a href=\"search\">Integer gravida</a> </li>\r\n\t\t\t\t\t<li class=\"last\"> <a href=\"about\">Ut nonummy rutrum</a> </li>\r\n\t\t\t\t</ul>\r\n\t\t\t</li>\r\n\t\t\t -->\r\n\t\t\t \r\n\t\t\t<li class=\"current_page_item\"><a href=\"Contact.html\"><span>Contact us</span></a></li>\r\n\t\t\t<li><a href=\"direction.html\"><span>Direction</span></a></li>\r\n\t\t</ul>\r\n\t\t<script type=\"text/javascript\">\r\n\t\t\t$('#menu').dropotron();\r\n\t\t</script> \r\n\t</div>\r\n\t<!-- end #menu -->\r\n\t<div id=\"splash\"><img src=\"images/pics01.jpg\" width=\"980\" height=\"300\" alt=\"\" /></div>\r\n");
      out.write("\t<div id=\"page\">\r\n\t\t<div class=\"post\">\r\n\t\t\t<h2 class=\"title\"><a href=\"#\">Form submitted Result</a></h2>\r\n\t\t\t<div class=\"entry\">\r\n\t\t\t\t");
 
			   		out.println(result + "\n");
				
      out.write("\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t</div>\r\n</div>\r\n<div id=\"footer\">\r\n\t<p>The site is power by <a href=\"http://www.rtsolinc.com/\">RTS</a>. </p>\r\n</div>\r\n<!-- end #footer -->\r\n</body>\r\n</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
