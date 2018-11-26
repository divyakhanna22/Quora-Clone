package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoginDB {
   public static boolean search(loginpage l)
    {
        loginpage ll = null;
        
        Configuration cf = new Configuration();
        
        cf.configure("HibernateCFG/hibernate.cfg.xml");
        
        SessionFactory sf = cf.buildSessionFactory();
        
        Session s = sf.openSession();
        
       
        
        ll = (loginpage)s.get(loginpage.class, l.getUsername());
        
        s.close();
        
        sf.close();
        
        if(ll == null)
        {
            return false;
        }
        else
        {
            if(ll.equals(l))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}