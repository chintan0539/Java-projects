<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged in</title>
</head>
<body>

	<%
	
	
	String uid=(String)session.getAttribute("user");
	if(uid==null){
		response.sendRedirect("1.jsp");	
	}
	else{
		out.println("<h1>Successfully logged in");
		%>
		<a href="4.jsp">Logout</a>
	<% }	%>
	
	 

</body>
</html>