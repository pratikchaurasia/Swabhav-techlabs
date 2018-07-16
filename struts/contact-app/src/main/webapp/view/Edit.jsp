<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="com.techlabs.model.Contact"%>
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
	<h1 align="center" class="jumbotron">Edit Contact</h1>
<%Contact contactInfo = (Contact) request.getAttribute("contactInfo"); %>
	<div class="form-basic container">
		<s:form action="editContacts">
			<input type="hidden" name="id" value="<s:property value="id" />" id="text" 
				class="form-group" value="contact.id"/><br>
			<b>Name : </b><input type="text"  id="text" name="name"
				class="form-group" required value="<s:property value="name" />"></input><br> 
			<b>Email : </b><input type="text" id="text" name="email"
			 	class="form-group" required value="<s:property value="email" />"></input><br>
			<b>Number : </b><input type="text" id="text" name="number"
				class="form-group" required value="<s:property value="number" />"></input><br> 
			
				<input type="submit" value="Edit" class="btn btn-success"><br>
		</s:form>
	</div>
</body>
</html>