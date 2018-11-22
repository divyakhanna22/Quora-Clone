<%
  if (session != null)
    session.invalidate();
  response.sendRedirect("homepage.jsp");
%>