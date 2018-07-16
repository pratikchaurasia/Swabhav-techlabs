<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<jsp:include page="../index.jsp" />
	<h1 align="center" class="jumbotron">Login</h1>
	<div class="form-basic container">
		<form action="login" method="post">

			<b>Username : <input type="text" class="form-group" name="user">
				<br> Password :
			</b><input type="password" class="form-group" name="pwd"> <br>
			
			<Button type="submit" class="btn btn-primary">
				<i class="fas fa-registered"></i>Login
			</Button>
		</form>
	</div>
</body>
</html>