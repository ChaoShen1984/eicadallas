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

public final class thankyou_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');

	String yearString = request.getParameter("year");
	String monthString = request.getParameter("month");
	String dateString = request.getParameter("date");
	String timeToString = request.getParameter("timeTo");
	String timeFromString = request.getParameter("timeFrom");
	String emailString = request.getParameter("email");
	String phoneString = request.getParameter("phone");
	String firstnameString = request.getParameter("firstname");
	String lastnameString = request.getParameter("lastname");

      out.write("\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n<!--\nDesign by Free CSS Templates\nhttp://www.freecsstemplates.org\nReleased for free under a Creative Commons Attribution 2.5 License\n\nName       : FootBall   \nDescription: A two-column, fixed-width design with simple color scheme.\nVersion    : 1.0\nReleased   : 20120604\n-->\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n<meta name=\"keywords\" content=\"\" />\n<meta name=\"description\" content=\"\" />\n<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n<title>EICA by RTS</title>\n<link href=\"http://fonts.googleapis.com/css?family=Abel|Arvo\" rel=\"stylesheet\" type=\"text/css\" />\n<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n<script type=\"text/javascript\" src=\"jquery-1.7.1.min.js\"></script>\n<script type=\"text/javascript\" src=\"jquery.dropotron-1.0.js\"></script>\n</head>\n<body>\n<div id=\"wrapper\">\n\t<div id=\"header-wrapper\">\n\t\t<div id=\"header\">\n\t\t\t<div id=\"logo\">\n\t\t\t\t<h1><a href=\"#\">EICA</a></h1>\n");
      out.write("\t\t\t\t<p>England Indoor Cricket Academy</p>\n\t\t\t</div>\n\t\t</div>\n\t</div>\n\t<!-- end #header -->\n\t<div id=\"menu-wrapper\">\n\t\t<ul id=\"menu\">\n\t\t\t<li><a href=\"index.html\"><span>Homepage</span></a></li>\n\t\t\t<li class=\"current_page_item\"><a href=\"reservation.jsp\"><span>Reservation</span></a></li>\n\t\t\t<li><a href=\"store.jsp\"><span>Store</span></a></li>\n\t\t\t<li><a href=\"About.html\"><span>Abount us</span></a></li>\n\t\t\t\n\t\t\t<!-- \n\t\t\t<li><span>Links</span>\n\t\t\t\t<ul>\n\t\t\t\t\t<li class=\"first\"> <a href=\"index\">Maecenas luctus lectus</a> </li>\n\t\t\t\t\t<li> <a href=\"search\">Integer gravida</a> </li>\n\t\t\t\t\t<li class=\"last\"> <a href=\"about\">Ut nonummy rutrum</a> </li>\n\t\t\t\t</ul>\n\t\t\t</li>\n\t\t\t -->\n\t\t\t \n\t\t\t<li><a href=\"Contact.html\"><span>Contact us</span></a></li>\n\t\t\t<li><a href=\"direction.html\"><span>Direction</span></a></li>\n\t\t</ul>\n\t\t<script type=\"text/javascript\">\n\t\t\t$('#menu').dropotron();\n\t\t</script> \n\t</div>\n\t<!-- end #menu -->\n\t<div id=\"splash\"><img src=\"images/pics01.jpg\" width=\"980\" height=\"300\" alt=\"\" /></div>\n\t<div id=\"page\">\n\t\t<div class=\"post\">\n");
      out.write("\t\t\t<h2 class=\"title\"><a href=\"#\">Thank you!</a></h2>\n\t\t\t<div class=\"entry\">\n\t\t\t<p>Thank you ");
      out.print(firstnameString );
      out.write(' ');
      out.print(lastnameString );
      out.write(".</p>\n\t\t\t<p>Your reservation has been made successfully on ");
      out.print(monthString);
      out.write('/');
      out.print(dateString);
      out.write('/');
      out.print(yearString);
      out.write(" from ");
      out.print(timeFromString );
      out.write(" to ");
      out.print(timeToString );
      out.write(". Please call us in 24 hours to confirm your reservation. Otherwise, we will cancel your reservation automatically.</p>  \n\t\t\t</div>\n\t\t</div>\n\t</div>\n</div>\n<div id=\"footer\">\n\t<p>The site is power by <a href=\"http://www.rtsolinc.com/\">RTS</a>.\n</div>\n<!-- end #footer -->\n</body>\n</html>");
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
