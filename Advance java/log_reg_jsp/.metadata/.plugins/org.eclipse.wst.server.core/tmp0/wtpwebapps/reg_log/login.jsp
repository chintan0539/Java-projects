<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*"%>
    <%
    	String userid=request.getParameter("usr");
    	String password=request.getParameter("password");
    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_proj","root","root123");
    	
    	Statement st=conn.createStatement();
    	ResultSet rs=st.executeQuery("select email,password from tbllogin where email='"+userid+"' and password='"+password+"'");
    	try{
    	rs.next();
    	if(rs.getString("email").equals(password)&&rs.getString("password").equals(userid))
    	{
    	out.println("Welcome");
    	}
    	else{
    		out.println("Invalid pass or user name");	
    	}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	%>