<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*"%>

    <%
    	String username=request.getParameter("usernm");
    	String password=request.getParameter("pass");
    		try{
    			
    			
    			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/dblibrary","root","root123");
    			PreparedStatement ps=(PreparedStatement) c.prepareStatement("INSERT INTO tbladmin (username,password) VALUES ('"+username+"','"+password+"') ");
    			ps.executeUpdate();
    		
    			response.sendRedirect("index.jsp");
    		
    		
    		
    		}catch(Exception e){
    			out.println("Error");
    		}
    		
    		
    		
    		
    		
    	    	    	    	
    	    		
    	    	
    	    	
    
    
    
    
    
    %>