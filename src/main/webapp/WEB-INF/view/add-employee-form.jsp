<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Employee Form</title>
</head>
<body>

	<h2>Enter Employee Information</h2>

	<form:form modelAttribute="employee" action="submitEmployee">

		<form:input path="eno" placeholder="Emp number" />
		<br>
		<form:input path="ename" placeholder="Emp name" />
		<br>
		<form:input path="desg" placeholder="Desg" />
		<br>
		<form:input path="sal" placeholder="Salary" />
		<br>
		<input type="submit" value="RegisterEmployee">
	</form:form>

</body>
</html>
