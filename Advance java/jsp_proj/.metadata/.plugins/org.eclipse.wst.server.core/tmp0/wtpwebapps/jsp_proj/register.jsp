<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String fname=request.getParameter("fnm");
String lname=request.getParameter("lnm");
String email=request.getParameter("mail");
String password=request.getParameter("password");

try{
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_proj","root","root123");
	/*Statement st=conn.createStatement();*/
	PreparedStatement rs=(PreparedStatement) conn.prepareStatement("INSERT INTO tbllogin (fname,lname,email,password) VALUES ("+fname+","+lname+","+email+","+password+") ");
	out.println("Successfully registered");
}catch(Exception e){
	out.println("opps");
}


			
	
	


%>