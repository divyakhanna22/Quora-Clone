package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDB {
   public static boolean validate(String name, String pass)
   {
       boolean status=false;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?useSSL=false&verifyServerCertificate=false&allowMultiQueries=true","root","october22");
           PreparedStatement ps = con.prepareStatement("select * from userlogin where username=? and password=?");
           ps.setString(1,name);
           ps.setString(2,pass);
           
           ResultSet rs = ps.executeQuery();
           status = rs.next();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       return status;
   }
}