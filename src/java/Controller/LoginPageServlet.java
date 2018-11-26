package Controller;

import Model.LoginDB;
import Model.loginpage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginPageServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            PrintWriter out = response.getWriter();
            String uname = request.getParameter("uname");
            String pwd = request.getParameter("pwd");
            loginpage l = new loginpage(uname,pwd);
            if(LoginDB.search(l)){
                HttpSession session = request.getSession();
                session.setAttribute("uname", uname);
                
                RequestDispatcher rd=request.getRequestDispatcher("homepage.jsp");
                rd.forward(request,response);
            }
            else{
                out.print("User does not exist. Please sign up!");
                RequestDispatcher rd=request.getRequestDispatcher("loginpage.html");
                rd.include(request,response);
            } 
        }
        catch(IOException | ServletException e){
        System.out.print(e);
        }
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
