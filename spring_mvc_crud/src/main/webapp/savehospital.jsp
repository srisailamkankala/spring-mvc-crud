<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="savehospital" modelAttribute="load">
	
	Name:<form:input path="name"/><br><br>
	Web:<form:input path="web"/><br><br>
	Rating:<form:input path="rating"/><br><br>
	Phone:<form:input path="phone"/><br><br>
		<form:button>register</form:button>
		
	</form:form>
</body>
</html>