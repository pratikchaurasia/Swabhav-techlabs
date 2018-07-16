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
	<h1 align="center" class="jumbotron">Edit Student Details</h1>
	<div class="form-basic container">
		<s:form action="editStudent">
			<input type="hidden" name="rollNo" value="<s:property value="rollNo" />" id="number" 
				class="form-group" /><br>
			<b>First Name : </b><input type="text"  id="text" name="firstName"
				class="form-group" required value="<s:property value="firstName" />"></input><br> 
			<b>Last Name : </b><input type="text" id="text" name="lastName"
			 	class="form-group" required value="<s:property value="lastName" />"></input><br>
			<b>Address : </b><input type="text" id="text" name="address"
				class="form-group" required value="<s:property value="address" />"></input><br> 
			
				<input type="submit" value="Edit" class="btn btn-success"><br>
		</s:form>
	</div>
</body>
</html>