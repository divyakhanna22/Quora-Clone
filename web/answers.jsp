<html>
<title>answers</title>
<head>
<style>
html
{
    background: url(green-leaves-plant-1072179.jpg) no-repeat center fixed;
    background-size: 1366px 850px;
}
.ans
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
    color: black;
}
.ans
{
   font-family: Corbel;
   text-align: center;
   font-size: 32px;
   color: white;
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
</style>
</head>
<script>
    function submitAnswer() {
    var res = confirm("Are you sure?");
if(res == true){
    alert("Answer Submitted");
}
}
</script>
<body>
    <form method="post">
        <font size="12" align="center" face="Lucida Bright" color="white"><h2>Let's Answer
            <button type="submit" class="button" formaction="homepage.jsp">Home</button></h2><br>
    </form>
    </font>
    <form action="AnswerQuestionServlet" method="post">
        <div class="ans">Submit your answer here:<br><br>
<textarea placeholder="Enter question id" name="qid"></textarea>
<textarea placeholder="Enter your answer" name="answer"></textarea><br><br>
<button type="submit" class="button"  onclick="submitAnswer()">Submit</button>
</form>
</div>
</body>
</html>