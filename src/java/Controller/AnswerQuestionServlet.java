package Controller;

import java.io.IOException;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnswerQuestionServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        int qid = Integer.parseInt(request.getParameter("qid"));
        String uname = (String) request.getSession().getAttribute("uname");
        String answer = request.getParameter("answer");
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?useSSL=false&allowPublicKeyRetrieval=true&verifyServerCertificate=false&allowMultiQueries=true","root","october22");
            PreparedStatement ps = con.prepareStatement("insert into answertable(qid,uname,answer) values(?,?,?)");
            
            ps.setInt(1,qid);
            ps.setString(2,uname);
            ps.setString(3,answer);
            
            int i=ps.executeUpdate();
       if(i>0)
       {
           RequestDispatcher rd = request.getRequestDispatcher("/homepage.jsp");
                rd.forward(request, response);
       }
        } 
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            out.close();
        }
    }   
    }