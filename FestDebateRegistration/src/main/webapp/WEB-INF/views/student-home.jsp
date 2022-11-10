<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Page</title>
</head>
<body>
<div align="right"><form:form action="${pageContext.request.contextPath}/logout" method="POST">
<input type="submit" value="Logout"/>
</form:form></div>
<div>User: <security:authentication property="principal.username"/><br>
User Role : <security:authentication property="principal.authorities"/>
</div>
<h1>Welcome to Student Home Page</h1>
</body>
</html>