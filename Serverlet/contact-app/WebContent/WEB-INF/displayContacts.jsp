<%@page import="java.util.Iterator"%>
<%@page import="com.techlabs.contacts.model.Contact"%>
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
				String username = (String) session.getAttribute("userName");
				if (username != null) {
			%>
			<a style="float: right" href="/contact-app/logout">Logout</a>
			<a style="float: right"><%=username%></a>
			
			<%}else{%>
					<a style="float: right">Guest</a>
			<%}%>
			

		</form>
	</div>
	<div class="col-md-6">

		<%
			if ((List<Contact>) request.getAttribute("contacts") != null) {
		%>
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
			<%
				List<Contact> contactList = (List<Contact>) request
							.getAttribute("contacts");
					for (Contact contact : contactList) {
			%>
			<tr>
				<td><%=contact.getID()%></td>
				<td><%=contact.getName()%></td>
				<td><%=contact.getEmail()%></td>
				<td><%=contact.getNumber()%></td>
				<td><button id='button' class='btn btn-primary'
						value="<%=contact.getID()%>"
						onclick="location.href='editContacts?id=<%=contact.getID()%>';">Edit</button></td>
			</tr>
			<%
				}
			%>
		</table>
		<%
			} else {
		%>
		<h1>Please Add Contact no Contacts to Display</h1>
		<%
			}
		%>

		<div>
			<form action="addContacts" method="get">
				<input type="submit" value="Add" class="btn btn-success"><br>
			</form>

		</div>
	</div>


</body>
</html>