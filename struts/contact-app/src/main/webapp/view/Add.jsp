<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center" class="jumbotron">Add Contact</h1>

	<div class="form-basic container">
		<s:form action="addContacts">
			<b>Name : </b><input type="text" name="name" id="text"
				class="form-group" required></input><br> <b>Email : </b><input
				type="text" name="email" id="text" class="form-group" required></input><br>
			<b>Number : </b><input type="text" name="number" id="text"
				class="form-group" required></input><br> 
				<input type="submit" value="Add" class="btn btn-success"><br>
		</s:form>
	</div>
</body>
</html>