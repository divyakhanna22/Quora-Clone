<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<html>
<title>questions</title>
<head>
<style>
html
{
        background: url(beverage-blank-break-997719.jpg) no-repeat center fixed;
        background-size: 1366px 850px;
}
.ques
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
#questions 
{
    font-family: Corbel;
    border-collapse: collapse;
    width: 100%;
    background-color: rgba(192,192,192,0.2);
}

#questions td, #questions th 
{
    border: 1px solid #ddd;
    padding: 15px;
    color: black;
    font-size: 17px;
    font-family: Corbel;
    
}
#questions tr:hover 
{
    background-color: #ddd;
    color: black;
}
#questions th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: center;
    background-color: black;
    font-size: 20px;
    color: white;
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
button[type=submit]:hover {
    background-color: #00cc66;
    color: black
}
</style>
</head>
<body>
    <form action="AnswerQuestionServlet" method="post">
        <font size="12" align="center" face="Lucida Bright" color="black"><h2>Questions
            <button type="submit" class="button" formaction="homepage.jsp">Home</button> <button type="submit" class="button" formaction="answers.jsp">Answer</button>
        </h2>
    </form>
    </font><br>
<div class = "ques">
<form method="post">
<table id = "questions">
<tr>
    <th>QUESTION ID</th>
    <th>USERNAME</th>
    <th>TOPIC</th>
    <th>SUB-TOPIC</th>
    <th>QUESTION</th>
</tr>
<%
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
%>
    <tr>
        <td><%=rs.getInt("qid")%></td>
    <td><%=rs.getString("qname")%></td>
    <td><%=rs.getString("topic")%></td>
    <td><%=rs.getString("stopic")%></td>
    <td><%=rs.getString("ques")%></td>
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