package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public final class questions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<title>questions</title>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write(".ques\r\n");
      out.write("{\r\n");
      out.write("   height: 500px;\r\n");
      out.write("   width: 50%;\r\n");
      out.write("   font-family: Lucida Bright;\r\n");
      out.write("   text-align: justify;\r\n");
      out.write("   font-size: 14px;\r\n");
      out.write("   opacity: 2;\r\n");
      out.write("   color: white;\r\n");
      out.write("   margin-left: auto;\r\n");
      out.write("   margin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("#questions {\r\n");
      out.write("    font-family: Corbel;\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    background-color: rgba(192,192,192,0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#questions td, #questions th {\r\n");
      out.write("    border: 1px solid #ddd;\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("    font-family: Corbel;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#questions tr:hover \r\n");
      out.write("{\r\n");
      out.write("    background-color: black;\r\n");
      out.write("    color: #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#questions th {\r\n");
      out.write("    padding-top: 12px;\r\n");
      out.write("    padding-bottom: 12px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    background-color: black;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write("button[type=submit] {\r\n");
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
      out.write("    float: right;\r\n");
      out.write("}\r\n");
      out.write("button[type=submit]:hover {\r\n");
      out.write("    background-color: #00cc66;\r\n");
      out.write("    color: black}\r\n");
      out.write("#particle-js canvas\r\n");
      out.write("{\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    width:100%;\r\n");
      out.write("    height:100%;\r\n");
      out.write("    z-index:-999;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#000000\">\r\n");
      out.write("    <div id=\"particle-js\"></div>\r\n");
      out.write("    <form action=\"AnswerQuestionServlet\" method=\"post\">\r\n");
      out.write("        <font size=\"12\" align=\"center\" face=\"Lucida Bright\" color=\"white\"><h2>Questions\r\n");
      out.write("            <button type=\"submit\" class=\"button\" formaction=\"homepage.jsp\">Home</button> <button type=\"submit\" class=\"button\" formaction=\"answers.jsp\">Answer</button>\r\n");
      out.write("        </h2>\r\n");
      out.write("    </form>\r\n");
      out.write("    </font><br>\r\n");
      out.write("    <div class = \"ques\">\r\n");
      out.write("<form method=\"post\">\r\n");
      out.write("<table id = \"questions\">\r\n");
      out.write("<tr>\r\n");
      out.write("    <th>QUESTION ID</th>\r\n");
      out.write("    <th>USERNAME</th>\r\n");
      out.write("    <th>TOPIC</th>\r\n");
      out.write("    <th>SUB-TOPIC</th>\r\n");
      out.write("    <th>QUESTION</th>\r\n");
      out.write("</tr>\r\n");

try
{
Class.forName("com.mysql.jdbc.Driver");
String username="root";
String password="october22";
String query="select * from questiontable";
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?useSSL=false&allowPublicKeyRetrieval=true&verifyServerCertificate=false&allowMultiQueries=true","root","october22");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(query);
while(rs.next())
{


      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>");
      out.print(rs.getInt("qid"));
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs.getString("uname"));
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs.getString("topic"));
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs.getString("stopic"));
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs.getString("ques"));
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        ");


}

      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("    ");

    rs.close();
    stmt.close();
    con.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }

      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"particles.js\"></script>\r\n");
      out.write("<script src=\"particlesjs-config.json\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
