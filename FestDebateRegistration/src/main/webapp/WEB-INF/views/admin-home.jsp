<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>
</head>
<body>
<div align="right"><form:form action="${pageContext.request.contextPath}/logout" method="POST">
<input type="submit" value="Logout"/>
</form:form></div>
<div>User: <security:authentication property="principal.username"/><br>
User Role : <security:authentication property="principal.authorities"/>
</div>
<div align="center"><h2>Welcome to Admin Page of Student Debate Registration..!!!</h2></div>
<div><form action="admin/addStudent" method="get"><input type="button" value="Register Student" /></form></div>
<div><h3>List of all Registered Students</h3></div>

</body>
</html>