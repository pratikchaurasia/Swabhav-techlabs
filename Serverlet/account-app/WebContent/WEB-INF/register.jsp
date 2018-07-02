<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="../index.jsp" />
	<h1 align="center" class="jumbotron">Register</h1>
	<div class="form-basic container">
		<form action="register" method="post">

			<b>Name : <input type="text" class="form-group" name="user" required><br> 
			Password :<input type="password" class="form-group" name="pwd" required> <br>
			Re-Enter Password :<input type="password" class="form-group" name="repwd" required> <br>
			Initial Amount : </b><input type="number" class="form-group" name="amount" required><br> 
			<input type="submit" class="btn btn-success" value="Register">
		</form>
	</div>
</body>
</html>