<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*"%>

    <%
    	String uid=request.getParameter("username");
    	String pass=request.getParameter("password");
    	
    	
    		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/trial","root","root123");
    		Statement s=c.createStatement();
    		
    		ResultSet rs= s.executeQuery("select username,password from tblad where username='"+uid+"' and password='"+pass+"'");
    		try{
    	    	rs.next();
    	    	if(rs.getString("username").equals(uid)&&rs.getString("password").equals(pass))
    	    	{
    	    		session.setAttribute("user", uid);
    				response.sendRedirect("3.jsp"); 
    	    	}
    	    	else{
    	    		response.sendRedirect("1.jsp");	
    	    	}
    	    	}catch(Exception e){
    	    		e.printStackTrace();
    	    	}
    
    
    
    
    
    %>