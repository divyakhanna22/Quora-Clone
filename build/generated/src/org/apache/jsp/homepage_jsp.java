package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

    if(session.getAttribute("uname") == null)
    {
        RequestDispatcher rd = request.getRequestDispatcher("loginpage.html");
        rd.forward(request, response);
    }
    HttpSession nsession = request.getSession(false);
    if(nsession != null)
    {
       
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<title>homepage</title>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write(".header {\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("* {\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav {\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    background-color: rgba(192,192,192,0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a {\r\n");
      out.write("    float: left;\r\n");
      out.write("    display: block;\r\n");
      out.write("    color: black;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 14px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a:hover {\r\n");
      out.write("    background-color: #ddd;\r\n");
      out.write("    color: black;\r\n");
      out.write("}\r\n");
      out.write("html\r\n");
      out.write("{\r\n");
      out.write("    background: url(agreement-application-business-893894.jpg) no-repeat center fixed;\r\n");
      out.write("    background-size: 1366px 850px;\r\n");
      out.write("}\r\n");
      out.write(".button {\r\n");
      out.write("    background-color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: black;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    margin: 8px 4px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("textarea {\r\n");
      out.write("    width: 70%;\r\n");
      out.write("    height: 70px;\r\n");
      out.write("    padding: 12px 20px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    border: 2px solid black;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    background-color: #f8f8f8;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    resize: none;\r\n");
      out.write("    float: center;\r\n");
      out.write("    color: black;\r\n");
      out.write("}\r\n");
      out.write(".topnav .search-container {\r\n");
      out.write("  float: right;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav input[type=text] {\r\n");
      out.write("  padding: 6px;\r\n");
      out.write("  margin-top: 8px;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  border: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav .search-container button {\r\n");
      out.write("  float: right;\r\n");
      out.write("  padding: 8px 12px;\r\n");
      out.write("  margin-top: 8px;\r\n");
      out.write("  margin-right: 16px;\r\n");
      out.write("  background: #ddd;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav .search-container button:hover {\r\n");
      out.write("  background-color: #00cc66;\r\n");
      out.write("    color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav .search-container {\r\n");
      out.write("    float: none;\r\n");
      out.write("  }\r\n");
      out.write(".topnav .search-container button {\r\n");
      out.write("    float: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .topnav input[type=text] {\r\n");
      out.write("    border: 1px solid #ccc;  \r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(".row {\r\n");
      out.write("  display: flex;\r\n");
      out.write("}\r\n");
      out.write(".left {\r\n");
      out.write("  flex: 17%;\r\n");
      out.write("  padding: 15px 0;\r\n");
      out.write("  background-color: rgba(192,192,192,0.6);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right {\r\n");
      out.write("  flex: 83%;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  background-color: rgba(192,192,192,0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#myMenu {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#myMenu li a {\r\n");
      out.write("  background-color: rgba(192,192,192,0.2);\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 20px;\r\n");
      out.write("  color: black;\r\n");
      out.write("  display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#myMenu li a:hover {\r\n");
      out.write("  background-color: black;\r\n");
      out.write("  color: #ddd;\r\n");
      out.write("}\r\n");
      out.write(".overlay {\r\n");
      out.write("    height: 0%;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    background-color: rgb(0,0,0);\r\n");
      out.write("    background-color: rgba(0,0,0, 0.9);\r\n");
      out.write("    overflow-y: hidden;\r\n");
      out.write("    transition: 0.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".overlay-content {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top: 25%;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write(".overlay .closebtn {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 20px;\r\n");
      out.write("    right: 45px;\r\n");
      out.write("    font-size: 60px;\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-height: 450px) {\r\n");
      out.write("  .overlay {overflow-y: auto;}\r\n");
      out.write("  .overlay .closebtn {\r\n");
      out.write("    font-size: 40px;\r\n");
      out.write("    top: 15px;\r\n");
      out.write("    right: 35px;\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("input[type=submit] {\r\n");
      out.write("    background-color: black;\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: #ddd;\r\n");
      out.write("    padding: 12px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    margin: 8px 4px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("input[type=submit]:hover {\r\n");
      out.write("    background-color: #00cc66;\r\n");
      out.write("    color: black;\r\n");
      out.write("}\r\n");
      out.write(".logout\r\n");
      out.write("{\r\n");
      out.write("    float: right;\r\n");
      out.write("    background-color: rgba(192,192,192,0.7);\r\n");
      out.write("    color: red;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("}\r\n");
      out.write(".uname\r\n");
      out.write("{\r\n");
      out.write("    float: right;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"container\">\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("<img src=\"logo1.png\" height=\"90\" width=\"100\" align=\"left\">\r\n");
      out.write("<div class=\"uname\">\r\n");
      out.print( request.getSession().getAttribute("uname").toString()
        );
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"topnav\">\r\n");
      out.write("<font size=\"4\" align=\"center\" face=\"Lucida Bright\" color=\"white\">\r\n");
      out.write("<a href=\"file:///C:/Users/Acer/Desktop/Divya/JAVA%20PROJECT/homepage.html\">Home</a>\r\n");
      out.write("<span style=\"cursor:pointer\" onclick=\"openNav()\"><a href\"#\">About</a></span>\r\n");
      out.write("<a href=\"#\">Answer</a>\r\n");
      out.write("<form action=\"LogoutServlet\" method=\"post\">\r\n");
      out.write("    <div class=\"logout\"><input type=\"submit\" value=\"Logout\"></div>\r\n");
      out.write("</form>\r\n");
      out.write("</font>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("  <div class=\"left\">\r\n");
      out.write("    <ul id=\"myMenu\">\r\n");
      out.write("      <li><a href=\"homepage.jsp\">Feed</a></li>\r\n");
      out.write("      <li><a href=\"restaurants.html\">Restaurants</a></li>\r\n");
      out.write("      <li><a href=\"photography.html\">Photography</a></li>\r\n");
      out.write("      <li><a href=\"fashion&style.html\">Fashion and Style</a></li>\r\n");
      out.write("      <li><a href=\"travel.html\">Travel</a></li>\r\n");
      out.write("      <li><a href=\"mathematics.html\">Mathematics</a></li>\r\n");
      out.write("      <li><a href=\"cooking.html\">Cooking</a></li>\r\n");
      out.write("      <li><a href=\"education.html\">Education</a></li>\r\n");
      out.write("      <li><a href=\"movies.html\">Movies</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"right\">\r\n");
      out.write("<form>\r\n");
      out.write("<pre>                   <textarea placeholder=\"What is your question?\"></textarea></pre>\r\n");
      out.write("<pre>                                                            <input type=\"submit\" value=\"Add Question\"></pre>\r\n");
      out.write("</form>    \r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"myNav\" class=\"overlay\">\r\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("  <div class=\"overlay-content\">\r\n");
      out.write("    <font size=\"6\" align=\"center\" face=\"Lucida Bright\" color=\"white\">\r\n");
      out.write("    <p>Quezone</p></font>\r\n");
      out.write("    <font size=\"4\" align=\"center\" face=\"Lucida Bright\" color=\"white\">\r\n");
      out.write(" <p>The name of the software product is Quezone. Quezone is a question-and-answer website where questions are asked, answered, edited and organized by its community of users. The aim of Quezone is to provide information to the users about each and every field of society. Every person can use it online without a fee. People from different regions of the world can connect to it and exchange information with other people. It is an independent system. After logging into and starting to use the Quezone, any user can share his/her questions or answer like whatever he/she is thinking, whatever he/she wants to know. Other users can see his/her question and will be able to answer to it. Furthermore, a user can also search for a question which has already been asked/answered.</p>\r\n");
      out.write("</font>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("function myFunction() {\r\n");
      out.write("    var input, filter, ul, li, a, i;\r\n");
      out.write("    input = document.getElementById(\"mySearch\");\r\n");
      out.write("    filter = input.value.toUpperCase();\r\n");
      out.write("    ul = document.getElementById(\"myMenu\");\r\n");
      out.write("    li = ul.getElementsByTagName(\"li\");\r\n");
      out.write("    for (i = 0; i < li.length; i++) {\r\n");
      out.write("        a = li[i].getElementsByTagName(\"a\")[0];\r\n");
      out.write("        if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {\r\n");
      out.write("            li[i].style.display = \"\";\r\n");
      out.write("        } else {\r\n");
      out.write("            li[i].style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("function openNav() {\r\n");
      out.write("  document.getElementById(\"myNav\").style.height = \"100%\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function closeNav() {\r\n");
      out.write("  document.getElementById(\"myNav\").style.height = \"0%\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
