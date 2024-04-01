<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title><base>
<style type="text/css">
table{
border-collapse:collapse;

}
th{
background-color:lime;
}
</style>
</head>
<body>
	<center>
	<h2>Display Hospitals Table</h2>
	<table border="2px">
	<tr>
		
			<th>ID</td>
			<th>NAME</td>
			<th>WEB</td>
			<th>RATING</td>
			<th>PHONE</td>
			<th>EDIT</td>
			<th>DELETE</td>
		
	</tr>
	<c:forEach var="var" items="${list}">
	<tr>
		<td>${var.getId()}</td>
		<td>${var.getName()}</td>
		<td>${var.getWeb()}</td>
		<td>${var.getRating()}</td>
		<td>${var.getPhone()}</td>
		<td><a href="gethospitalbyid?id=${var.getId()}">Edit</a></td>
		<td><a href="deletehospital?id=${var.getId()}">Delete</a></td>
	</tr>
	</c:forEach>
	</table></center>
</body>
</html>