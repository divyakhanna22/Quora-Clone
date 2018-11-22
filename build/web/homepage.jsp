<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(session.getAttribute("uname") == null)
    {
        response.sendRedirect("loginpage.html");
        //RequestDispatcher rd = request.getRequestDispatcher("loginpage.html");
        //rd.forward(request, response);
    }
    HttpSession nsession = request.getSession(false);
    if(nsession != null)
    {
       %>
<html>
<title>homepage</title>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.header {
    background-color: transparent;
    padding: 20px;
    text-align: center;
    cursor: pointer;
}
* {
    box-sizing: border-box;
}

body {
  margin: 0;
}

.topnav {
    overflow: hidden;
    background-color: rgba(192,192,192,0.2);
}

.topnav a {
    float: left;
    display: block;
    color: black;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

.topnav a:hover {
    background-color: #ddd;
    color: black;
}
html
{
    background: url(blank-brainstorming-business-6357.jpg) no-repeat center fixed;
    background-size: 1366px 850px;
}
.button {
    background-color: white;
    border: none;
    color: black;
    padding: 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 8px 4px;
    cursor: pointer;
}
textarea {
    width: 60%;
    height: 80px;
    padding: 12px 20px;
    box-sizing: border-box;
    border: 2px solid black;
    border-radius: 5px;
    background-color: #f8f8f8;
    font-size: 18px;
    resize: none;
    float: center;
    color: black;
    font-family: Corbel;
}
.topnav .search-container {
  float: right;
  border-radius: 5px;
}

.topnav input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.topnav .search-container button {
  float: right;
  padding: 8px 12px;
  margin-top: 8px;
  margin-right: 16px;
  background: #ddd;
  font-size: 17px;
  border: none;
  cursor: pointer;
  border-radius: 5px;
}

.topnav .search-container button:hover {
  background-color: #00cc66;
    color: black;
}

.topnav .search-container {
    float: none;
  }
.topnav .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 20px;
  }
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
.row {
  display: flex;
}
.left {
  flex: 17%;
  padding: 0px 0px;
  background-color: rgba(192,192,192,0.6);
  margin-left: 0px;
  margin-top: -12px;
}
.right {
  flex: 83%;
  padding: 15px;
  background-color: rgba(192,192,192,0.2);
}

#myMenu {
  list-style-type: none;
  padding: 0;
  margin: 0;
}

#myMenu li a {
  background-color: rgba(192,192,192,0.2);
  padding: 12px;
  text-decoration: none;
  font-size: 17px;
  color: black;
  display: block;
}

#myMenu li a:hover {
  background-color: black;
  color: #ddd;
}
.overlay {
    height: 0%;
    width: 100%;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: rgb(0,0,0);
    background-color: rgba(0,0,0, 0.9);
    overflow-y: hidden;
    transition: 0.5s;
}

.overlay-content {
    position: relative;
    top: 25%;
    width: 100%;
    text-align: center;
    margin-top: 30px;
}
.overlay .closebtn {
    position: absolute;
    top: 20px;
    right: 45px;
    font-size: 60px;
    color: white;
}

@media screen and (max-height: 450px) {
  .overlay {overflow-y: auto;}
  .overlay .closebtn {
    font-size: 40px;
    top: 15px;
    right: 35px;
    
  }
}
input[type=submit] {
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
}
input[type=submit]:hover {
    background-color: #00cc66;
    color: black;
}
.logout
{
    margin-top: -10px;
    float: right;
    color: white;
    border-radius: 20px;
    font-family: Corbel;
}
.qs
{
   font-family: Corbel;
   text-align: center;
   font-size: 42px;
   color: white;
}
</style>
</head>
<body class="container">
<div class="header">
<img src="logo1.png" height="90" width="100" align="left">
</div>
<div class="topnav">
<font size="4" align="center" face="Lucida Bright" color="white">
<a href="file:///C:/Users/Acer/Desktop/Divya/JAVA%20PROJECT/homepage.html">Home</a>
<span style="cursor:pointer" onclick="openNav()"><a href"#">About</a></span>
<a href="#">Answer</a>
<form action="logout.jsp" method="post">
    <div class="logout">
<%= request.getSession().getAttribute("uname").toString()
        %>
        <input type="submit" value="Logout"></div></form>
</div>

<div class="row">
  <div class="left">
    <ul id="myMenu">
      <li><a href="homepage.jsp">Feed</a></li>
      <li><a href="restaurants.html">Restaurants</a></li>
      <li><a href="photography.html">Photography</a></li>
      <li><a href="fashion&style.html">Fashion and Style</a></li>
      <li><a href="travel.html">Travel</a></li>
      <li><a href="mathematics.html">Mathematics</a></li>
      <li><a href="cooking.html">Cooking</a></li>
      <li><a href="education.html">Education</a></li>
      <li><a href="movies.html">Movies</a></li>
    </ul>
  </div>
<div class="right">
<div class="qs">Have a question?</div>
<form>
<pre><textarea placeholder="Enter your topic.."></textarea></pre>
<pre><textarea placeholder="Enter your sub-topic.."></textarea></pre>
<pre><textarea placeholder="Enter your question.."></textarea></pre>
<pre><input type="submit" value="Add Question"></pre>
</form>
</div>
<div id="myNav" class="overlay">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <div class="overlay-content">
    <font size="6" align="center" face="Lucida Bright" color="white">
    <p>Quezone</p></font>
    <font size="4" align="center" face="Lucida Bright" color="white">
 <p>The name of the software product is Quezone. Quezone is a question-and-answer website where questions are asked, answered, edited and organized by its community of users. The aim of Quezone is to provide information to the users about each and every field of society. Every person can use it online without a fee. People from different regions of the world can connect to it and exchange information with other people. It is an independent system. After logging into and starting to use the Quezone, any user can share his/her questions or answer like whatever he/she is thinking, whatever he/she wants to know. Other users can see his/her question and will be able to answer to it. Furthermore, a user can also search for a question which has already been asked/answered.</p>
</font>
  </div>
</div>
<script>
function myFunction() {
    var input, filter, ul, li, a, i;
    input = document.getElementById("mySearch");
    filter = input.value.toUpperCase();
    ul = document.getElementById("myMenu");
    li = ul.getElementsByTagName("li");
    for (i = 0; i < li.length; i++) {
        a = li[i].getElementsByTagName("a")[0];
        if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else {
            li[i].style.display = "none";
        }
    }
}
function openNav() {
  document.getElementById("myNav").style.height = "100%";
}

function closeNav() {
  document.getElementById("myNav").style.height = "0%";
}
</script>
</body>
</html>
<%}
%>