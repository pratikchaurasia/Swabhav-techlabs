<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="com.techlabs.model.Contact"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Display Contacts</title>
</head>
<body>
	<h1 align="center" class="jumbotron">Contact Details</h1>
	<div class="col-md-11">
		<form action="logout" method="get">
			<%
			
			if (request.getSession().getAttribute("userName")!=null) {
				String username = (String) session.getAttribute("userName");
		%>
		<a style="float: right" href="logout">Logout</a> <a
			style="float: right"><%=username%></a>

		<%
			} else {
		%>
		<a style="float: right">Guest</a>
		<%
			}
		%>

		</form>
	</div>
	<div class="col-md-6">

		
		<table class="table table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Number</th>
					<th>Edit</th>
				</tr>
			</thead>
			<s:iterator value="contactList">

				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="number" /></td>
					<td><button id='button' class='btn btn-primary'
						value="id"
						onclick="location.href='edit?id=<s:property value="id" />';">Edit</button></td>
				</tr>
				
			</s:iterator>
				
			
		</table>
		

		<div>
			<s:form action="add" method="get">
				<input type="submit" value="Add" class="btn btn-success"><br>
			</s:form>

		</div>
	</div>


</body>
</html>