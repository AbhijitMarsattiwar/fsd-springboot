<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add-Form</title>
</head>
<body>
 <spring:url value="/book/save" var="saveURL" />
 
 <form:form modelAttribute="bookForm" method="post" action="${saveURL}" >

	<div class="table-responsive">
		<table class="table table-bordered" style="width: 300px">
			<tr>
				<td>Id :</td>
				<td><form:input type="text" path="id" /></td>
			</tr>
			<tr>
				<td>Title :</td>
				<td><form:input type="text" path="title" /></td>
			</tr>
			<tr>
				<td>Price :</td>
				<td><form:input type="text" path="price" /></td>
			</tr>
			<tr>
				<td>Volume :</td>
				<td><form:input type="text" path="volume" /></td>
			</tr>
			<tr>
				<td>Publish Date :</td>
				<td><form:input type="text" path="publishDateStr" /></td>
			</tr>  
			 <tr>
				<td>Subject :</td>
				<td>
                  <form:select path = "subjectId">
                     <form:option value = "NONE" label = "Select"/>
                     <form:options items = "${subjectList}" />
                  </form:select>     	
               </td>
			</tr>
			<tr>
				<td></td>
				<td>
				<!-- <input class="btn btn-primary btn-sm" type="submit" value="Submit" /> -->
				<button type="submit">Save</button>
				</td>
				
			</tr>
		</table>
		</div>
	</form:form>
	<br>
</body>
</html>