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

public final class reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n<!--\r\nDesign by Free CSS Templates\r\nhttp://www.freecsstemplates.org\r\nReleased for free under a Creative Commons Attribution 2.5 License\r\n\r\nName       : FootBall   \r\nDescription: A two-column, fixed-width design with simple color scheme.\r\nVersion    : 1.0\r\nReleased   : 20120604\r\n-->\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta name=\"keywords\" content=\"\" />\r\n<meta name=\"description\" content=\"\" />\r\n<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n<title>EICA by RTS</title>\r\n<link href=\"http://fonts.googleapis.com/css?family=Abel|Arvo\" rel=\"stylesheet\" type=\"text/css\" />\r\n<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\r\n<script type=\"text/javascript\" src=\"jquery-1.7.1.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"jquery.dropotron-1.0.js\"></script>\r\n</head>\r\n<body>\r\n<div id=\"wrapper\">\r\n\t<div id=\"header-wrapper\">\r\n\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n\t\t\t\t<h1><a href=\"#\">EICA</a></h1>\r\n\t\t\t\t<p>England Indoor Cricket Academy</p>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t</div>\r\n\t<!-- end #header -->\r\n\t<div id=\"menu-wrapper\">\r\n\t\t<ul id=\"menu\">\r\n\t\t\t<li><a href=\"index.html\"><span>Homepage</span></a></li>\r\n\t\t\t<li class=\"current_page_item\"><a href=\"#\"><span>Reservation</span></a></li>\r\n\t\t\t<li><a href=\"store.jsp\"><span>Store</span></a></li>\r\n\t\t\t<li><a href=\"About.html\"><span>Abount us</span></a></li>\r\n\t\t\t\r\n\t\t\t<!-- \r\n\t\t\t<li><span>Links</span>\r\n\t\t\t\t<ul>\r\n\t\t\t\t\t<li class=\"first\"> <a href=\"index\">Maecenas luctus lectus</a> </li>\r\n\t\t\t\t\t<li> <a href=\"search\">Integer gravida</a> </li>\r\n\t\t\t\t\t<li class=\"last\"> <a href=\"about\">Ut nonummy rutrum</a> </li>\r\n\t\t\t\t</ul>\r\n\t\t\t</li>\r\n\t\t\t -->\r\n\t\t\t \r\n\t\t\t<li><a href=\"Contact.html\"><span>Contact us</span></a></li>\r\n\t\t\t<li><a href=\"direction.html\"><span>Direction</span></a></li>\r\n\t\t</ul>\r\n\t\t<script type=\"text/javascript\">\r\n\t\t\t$('#menu').dropotron();\r\n\t\t</script> \r\n\t</div>\r\n\t<!-- end #menu -->\r\n\t<div id=\"splash\"><img src=\"images/pics01.jpg\" width=\"980\" height=\"300\" alt=\"\" /></div>\r\n");
      out.write("\t<div id=\"page\">\r\n\t\t<div class=\"post\">\r\n\t\t\t<h2 class=\"title\"><a href=\"#\">Reserve:</a></h2>\r\n\t\t\t<div class=\"entry\">\r\n\t\t\t<!-- the header for calendar part -->\r\n\t\t\t\t<table border=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<th>\r\n\t\t\t\t\t\t\t<form name=\"input\" method=\"get\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"year\" value=\"");
      out.print(cal.get(Calendar.YEAR) );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"month\" value=\"");
      out.print(cal.get(Calendar.MONTH) );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"offset\" value=\"-1\"/>\r\n\t\t\t\t\t\t\t\t<p><input type=\"submit\" value=\"Previous Month\" /></p>\r\n\t\t\t\t\t\t\t</form> \r\n\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t<th><font size=\"22\"> ");
      out.print(month[(cal.get(Calendar.MONTH))]);
      out.write("&nbsp");
      out.print(cal.get(Calendar.YEAR) );
      out.write(" </font></th>\r\n\t\t\t\t\t\t<th>\r\n\t\t\t\t\t\t\t<form name=\"input\" method=\"get\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"year\" value=\"");
      out.print(cal.get(Calendar.YEAR) );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"month\" value=\"");
      out.print(cal.get(Calendar.MONTH) );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"offset\" value=\"1\"/>\r\n\t\t\t\t\t\t\t\t<p><input type=\"submit\" value=\"Next Month\" /></p>\r\n\t\t\t\t\t\t\t</form> \r\n\t\t\t\t\t\t</th>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table> \r\n\t\t\t\t\r\n\t\t\t\t<!-- the body of calendar -->\r\n\t\t\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td valign=\"top\" align=\"right\" >\r\n\t\t\t\t<table border = \"1\" >\r\n\t\t\t\t<tr><td><p>");
      out.print(time[0]);
      out.write("</p></td></tr>\r\n\t\t\t\t<tr><td><p>");
      out.print(time[1]);
      out.write("</p></td></tr>\r\n\t\t\t\t<tr><td><p>");
      out.print(time[2]);
      out.write("</p></td></tr>\r\n\t\t\t\t<tr><td><p>");
      out.print(time[3]);
      out.write("</p></td></tr>\r\n\t\t\t\t<tr><td><p>");
      out.print(time[4]);
      out.write("</p></td></tr>\r\n\t\t\t\t<tr><td><p>");
      out.print(time[5]);
      out.write("</p></td></tr>\r\n\t\t\t\t<tr><td><p>");
      out.print(time[6]);
      out.write("</p></td></tr>\r\n\t\t\t\t<tr><td><p>");
      out.print(time[7]);
      out.write("</p></td></tr>\r\n\t\t\t\t<tr><td><p>");
      out.print(time[8]);
      out.write("</p></td></tr>\r\n\t\t\t\t<tr><td><p>");
      out.print(time[9]);
      out.write("</p></td></tr>\r\n\t\t\t\t<tr><td><p>");
      out.print(time[10]);
      out.write("</p></td></tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td valign=\"top\" align=\"left\">\r\n\t\t\t\t\t<div id=\"calendar-table\">\r\n\t\t\t\t\t<table border=\"1\">\r\n\t\t\t\t\t\t");
 for(int i=0; i<time.length; i++){
      out.write("\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t");
 for(int j=0; j<= cal.getActualMaximum(Calendar.DAY_OF_MONTH); j++){
      out.write("\r\n\t\t\t\t\t\t\t\t");
if(j==0){ 
      out.write("\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<!--  it is already handled by previous table\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<p>");
      out.print(time[i]);
      out.write("</p>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t\t\t");
} else if(i==0){
      out.write("\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<p> ");
      out.print(j );
      out.write("</p>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t");
} else{
      out.write("\r\n\t\t\t\t\t\t\t\t");
if(i==3 && j == 4){ 
      out.write("\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"#FFA500\">\r\n\t\t\t\t\t\t\t\t<p>Booked</p>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t");
} else if(i==5 && j == 7){
      out.write("\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"#FF0000\">\r\n\t\t\t\t\t\t\t\t<p>Reserved</p>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t");
} else{ 
      out.write("\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"#008000\">\r\n\t\t\t\t\t\t\t\t<form name=\"calendar\" action=\"reservationInfo.jsp\" method=\"get\" onsubmit=\"return confirm('Are you sure you want to make a reservation?')\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"year\" value=\"");
      out.print(cal.get(Calendar.YEAR) );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"month\" value=\"");
      out.print(cal.get(Calendar.MONTH)+1 );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"date\" value=\"");
      out.print(j );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"timeindex\" value=\"");
      out.print(i );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name =\"time\" value=\"");
      out.print(time[i]);
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t\t<p><input type=\"submit\" value=\"Reserve\" /></p>\r\n\t\t\t\t\t\t\t\t</form> \r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n\t\t\t\t\t\t\t");
 }
      out.write("\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t");
}
      out.write("\r\n\t\t\t\t\t</table> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t</div>\r\n</div>\r\n<div id=\"footer\">\r\n\t<p>The site is power by <a href=\"http://www.rtsolinc.com/\">RTS</a>. </p>\r\n</div>\r\n<!-- end #footer -->\r\n</body>\r\n</html>");
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
