<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*"%>

    <%
    	String tid=request.getParameter("tid");
    	String tdate=request.getParameter("tdate");
    	String memberno=request.getParameter("memberno");
    	String duuedate=request.getParameter("duedate");
    	String bookid=request.getParameter("bookid");
    	int t_id=Integer.parseInt(tid);
    	int m_no=Integer.parseInt(memberno);  
    	int b_id=Integer.parseInt(bookid);  
    	int status=1;
    	
    	
    		try{
    			
    			
    			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/dblibrary","root","root123");
    			Statement s=c.createStatement();
    			ResultSet rs= s.executeQuery("select status from tblbook where b_id="+b_id+" and status=0");
    			if(rs.next()){
    				PreparedStatement ps=(PreparedStatement) c.prepareStatement("INSERT INTO tblissuebook VALUES ("+t_id+",'"+tdate+"',"+m_no+",'"+duuedate+"',"+b_id+") ");
        			ps.executeUpdate();
        			
        			PreparedStatement ps2=(PreparedStatement) c.prepareStatement("update tblbook SET status="+status+" where b_id="+b_id+";");
        			ps2.executeUpdate();
        		
        			response.sendRedirect("issueBook.jsp");
    			}else{
    				out.println("Book is not available");
    			}
    			
    		
    		
    		
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    		
    		
    		
    		
    	    	    	    	
    	    		
    	    	
    	    	
    
    
    
    
    
    %>