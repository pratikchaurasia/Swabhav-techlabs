<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="style.css"></link>
</head>

<body>
<h1 align="center" color="red">Swabhav Bank</h1>
	<div class="navbar">
	<a href="index.jsp">Home</a>  
		
		<a href="register">Register</a>  
		<%
			String username = (String) session.getAttribute("userName");
			if (username != null) {
		%>
		<a style="float: right" href="logout">Logout</a> <a
			style="float: right"><%=username%></a>

		<%
			} else {
		%>
		<a href="login">Login</a>  
		<a style="float: right">Guest</a>
		<%
			}
		%>
	</div>
</body>
</html>