<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Search Form</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/book/searchBookById" var="searchURL" />
  <h2>Search Book</h2>
  <form:form modelAttribute="bookForm" method="post" action="${searchURL}" cssClass="form" >
   <div class="form-group">
    <label>Book Title</label>
    <form:input path="title" cssClass="form-control" id="title" />
   </div>
  
   <button type="submit" class="btn btn-primary">Search</button>
  </form:form>
  
  <br>
  	<c:if test=${bookSearched != null}>  
  	<table class="table table-striped">
		<tr>			
			<th>Id</th>
			<th>Title</th>
			<th>Price</th>
			<th>Volume</th>
			<th>Publish Date</th> 
		</tr>
		
			<tr>
				<td width="60" align="center">${bookSearched.id}</td>
				<td width="60" align="center">${bookSearched.title}</td>
				<td width="60" align="center">${bookSearched.price}</td>
				<td width="60" align="center">${bookSearched.volume}</td>
				<td width="60" align="center">${bookSearched.publishDate}</td>
			</tr>
	</table>
  	</c:if>
 </div>
</body>
</html>