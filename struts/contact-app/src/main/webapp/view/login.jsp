<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<h1 align="center" class="jumbotron">Login</h1>
	<div class="form-basic container">
		<s:form action="log_in">
			<b>Username : <input type="text" class="form-group" name="name" required>
			<br> Password : </b><input type="password" class="form-group"
				name="password" required /> <s:fielderror fieldName="password" style="color:red"/>
			<br> <input type="submit" class="btn btn-success" value="Login" >
		</s:form>
	</div>
</body>
</html>