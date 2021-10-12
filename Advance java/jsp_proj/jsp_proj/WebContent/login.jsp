<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*"%>
    <%
    	String userid=request.getParameter("usr");
    	String password=request.getParameter("password");
    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstudent","root","root123");
    	
    	Statement st=conn.createStatement();
    	ResultSet rs=st.executeQuery("select uname,upass from tbllogin where uname='"+userid+"' and upass='"+password+"'");
    	try{
    	rs.next();
    	if(rs.getString("upass").equals(password)&&rs.getString("uname").equals(userid))
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