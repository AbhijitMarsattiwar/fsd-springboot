<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Operations</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>

<div class="container">   
 <br>
	<h3>List of Books</h3>
	<table class="table table-striped">
		<tr>			
			<th>Id</th>
			<th>Title</th>
			<th>Price</th>
			<th>Volume</th>
			<th>Publish Date</th> 
			<th>Delete</th>
		</tr>
		<c:forEach items="${list}" var="book">

			<tr>
				<td width="60" align="center">${book.id}</td>
				<td width="60" align="center">${book.title}</td>
				<td width="60" align="center">${book.price}</td>
				<td width="60" align="center">${book.volume}</td>
				<td width="60" align="center">${book.publishDate}</td>
				<td width="60" align="center"><a href="/book/delete/${book.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
		  <spring:url value="/book/add" var="addURL" />
		 <a class="btn btn-primary" href="${addURL}">Add Book</a>
		 
		 <spring:url value="/book/searchBook" var="searchBookURL" />
		 <a class="btn btn-primary" href="${searchBookURL}">Search Book</a>
</div>
</body>
</html>