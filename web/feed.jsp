<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
<title>feed</title>
<head>
<style>
html
{
    background: url(botanical-cactus-close-up-305821.jpg) no-repeat center fixed;
    background-size: 1366px 850px;
}
button[type=submit] {
    background-color: black;
    border: none;
    color: #ddd;
    padding: 12px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 8px 4px;
    cursor: pointer;
    border-radius: 5px;
    float: right;
}
button[type=submit]:hover 
{
    background-color: #00cc66;
    color: black;
}
.feed
{
   height: 500px;
   width: 50%;
   font-family: Lucida Bright;
   text-align: justify;
   font-size: 14px;
   opacity: 2;
   color: white;
   margin-left: auto;
   margin-right: auto;
}
#feed-show 
{
    font-family: Corbel;
    border-collapse: collapse;
    width: 100%;
    background-color: rgba(192,192,192,0.2);
}

#feed-show td, #feed-show th 
{
    border: 1px solid #ddd;
    padding: 15px;
    color: white;
    font-size: 17px;
    font-family: Corbel;
    
}
#feed-show tr:hover 
{
    background-color: black;
    color: #ddd;
}
#feed-show th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: center;
    background-color: black;
    font-size: 20px;
    color: white;
}
</style>
</head>
<body>
<form method="post">
        <font size="12" align="center" face="Lucida Bright" color="black"><h2>Feed
        <button type="submit" class="button" formaction="homepage.jsp">Home</button></h2><br>
</form>
</font>
<div class = "feed">
<form method="post">
<table id = "feed-show">
<tr>
    <th>QUESTION ID</th>
    <th>WHO ASKED</th>
    <th>QUESTION</th>
    <th>WHO ANSWERED</th>
    <th>ANSWER</th>
</tr>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
String username="root";
String password="october22";
String query="select * from feed";
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?useSSL=false&allowPublicKeyRetrieval=true&verifyServerCertificate=false&allowMultiQueries=true","root","october22");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(query);
while(rs.next())
{
%>
    <tr>
        <td><%=rs.getString("qid")%></td>
    <td><%=rs.getString("qname")%></td>
    <td><%=rs.getString("ques")%></td>
    <td><%=rs.getString("aname")%></td>
    <td><%=rs.getString("answer")%></td>
    </tr>
        <%
}
%>
    </table>
    <%
    rs.close();
    stmt.close();
    con.close();
}
catch(Exception e)
{
    e.printStackTrace();
}
%>
</form>
</div>
</body>
</html>