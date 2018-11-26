
package Model;

public class loginpage {
    
    private String username;
    private String password;
    public loginpage(){}
    
    public loginpage(String username, String password)
  {
      this.username = username;
      this.password = password;
  }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean equals(Object o)
    {
        loginpage l = (loginpage)o;
        
        if(username.equals(l.getUsername()) && password.equals(l.getPassword()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
