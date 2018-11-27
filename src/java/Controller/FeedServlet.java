
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FeedServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
       
//        String qid = request.getParameter("qid");
//        String ques = request.getParameter("ques");
//        String answer = request.getParameter("answer");
//        String uname1 = request.getParameter("uname1");
//        System.out.println("check "+qid);
        System.out.println("");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?useSSL=false&allowPublicKeyRetrieval=true&verifyServerCertificate=false&allowMultiQueries=true","root","october22");
            PreparedStatement ps = con.prepareStatement("select questiontable.qid, questiontable.uname, questiontable.ques, answertable.uname, answertable.answer from questiontable inner join answertable on questiontable.qid=answertable.qid");
            
            ResultSet rs = ps.executeQuery();
             while(rs.next())
             {
                        
                        String qid = rs.getString(1);
                        System.out.println("check qid" + qid);
                         String uname1 = rs.getString(2);
                        String ques = rs.getString(3);
                        String uname = (String) request.getSession().getAttribute("uname");
                        String answer = rs.getString(4);
                        
                        PreparedStatement ps1 = con.prepareStatement("insert into feed values(?,?,?,?,?)");
                        ps1.setString(1,qid);
                        ps1.setString(2,uname1);
                        ps1.setString(3,ques);
                        ps1.setString(4,uname);
                        ps1.setString(5,answer);
                        int rs1 = ps1.executeUpdate();
            }
           
           RequestDispatcher rd = request.getRequestDispatcher("/feed.jsp");
                rd.forward(request, response);
       
       
        } 
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            out.close();
        }
        }
        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FeedServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FeedServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FeedServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FeedServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
