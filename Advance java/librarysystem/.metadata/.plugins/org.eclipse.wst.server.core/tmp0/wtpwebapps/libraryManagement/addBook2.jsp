<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*"%>

    <%
    	String name=request.getParameter("book_name");
    	String author=request.getParameter("book_author");
    	String price=request.getParameter("price");
    	int status=0;
    	
    		try{
    			
    			
    			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/dblibrary","root","root123");
    			PreparedStatement ps=(PreparedStatement) c.prepareStatement("INSERT INTO tblbook (bname,author,price,status) VALUES ('"+name+"','"+author+"','"+price+"',"+status+") ");
    			ps.executeUpdate();
    		
    			response.sendRedirect("addBook.jsp");
    		
    		
    		
    		}catch(Exception e){
    			out.println("Error");
    		}
    		
    		
    		
    		
    		
    	    	    	    	
    	    		
    	    	
    	    	
    
    
    
    
    
    %>