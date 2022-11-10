<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login Page</title>
</head>
<body style="background-color:buttonface;">
	<br>
	<br>
	<div align="center" >
		<h2>Admin Login</h2>
		<form:form
			action="${pageContext.request.contextPath}/authenticateTheUser"
			method="POST">
			<c:if test="${param.error != null}">
			<div><font color="red"><i>Sorry..!! You Entered invalid username/password</i></font></div>	
			</c:if>
			<c:if test="${param.logout != null}">
			<div><font color="green"><i>logged out successfully..!!</i></font></div>	
			</c:if>
			<table>
				<tr>
					<td>Username:</td>
					<td><input type="text" name="username" /></td>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" /></td>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Login" /></td>
			</table>
		</form:form>
	</div>
</body>
</html>