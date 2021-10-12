<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add-book</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</head>
<body>

	<%
	
	
	
		%>
		
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Library</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
        <li class="nav-item">
        <a class="nav-link" href="index.jsp">HOME</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Add-books</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="issueBook.jsp">issue-book</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="returnBook.jsp">return-book</a>
      </li>   
    </ul>
  </div>
</nav>
		
		
		<form action="addBook2.jsp">
  <div class="form-group">
    <label for="bnm">Book Name</label>
    <input type="text" class="form-control" id="bnm" name="book_name" >
  </div>
  <div class="form-group">
    <label for="bauth">Author</label>
    <input type="text" class="form-control" id="bauth" name="book_author" >
  </div>
  <div class="form-group">
    <label for="bprice">Price</label>
    <input type="text" class="form-control" id="bprice" name="book_price" >
  </div>
  
 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
		
		
		
	
	
	 
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
</body>
</html>