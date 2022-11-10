<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Student</title>
</head>
<body>
<div><h2>Add New Student</h2></div>
<form:form action="saveStudent" modelAttribute="Student">
<form:hidden path="studentId"/>
<table>
		<tr><td>First Name:</td><td><form:input path="firstName" required='true'/></td></tr>
		
		<tr><td>Last Name:</td><td><form:input path="lastName" required='true'/></td></tr>
		
		<tr><td>Course</td><td><form:input path="course" required='true' /></td></tr>
		
		<tr><td>Country</td><td><form:input path="country" required='true' /></td></tr>
		
		<tr><td colspan="2" align="center"><input type="submit" value="Save" style="width: 30 px;"/></td></tr>
	</table>

</form:form>
</body>
</html>