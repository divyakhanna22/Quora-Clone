<%-- 
    Document   : newjsp
    Created on : 30 Oct, 2018, 1:57:54 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int x = 10;
            for(int i=1;i<=10;i++)
            {
                out.println("Hello world!");
            }
        %>
        <ul>
            
          <%
              String name = (String) request.getAttribute("name");
              
              String pwd = (String) request.getAttribute("pwd");
              for(int j=1;j<=10;j++)
              {
                  %>
                  <li><%= j%></li>
                  <%  
              }
          %>
                  
         <h1><%= name%></h1>
                  
         <h1><%= pwd%></h1>
                  
                 
        </ul>
        
        <h1>Hello World!</h1>
        
        <h1><%= x%></h1>
    </body>
</html>