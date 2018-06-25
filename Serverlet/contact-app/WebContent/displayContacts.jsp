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
	<div class="col-md-6">
		<%
			if ((List<Contact>) request.getAttribute("contacts") != null) {
				out.println("true");
		%>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Email</th>
					<th>Number</th>
				</tr>
			</thead>
			<%
				List<Contact> contactList = (List<Contact>) request
								.getAttribute("contacts");
				for (Contact contact : contactList) {
			%>
			<tr>
				<td><%=contact.getName()%></td>
				<td><%=contact.getEmail()%></td>
				<td><%=contact.getNumber()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<%
			}else{
		%>
		<h1>Please Add Contact no Contacts to Display</h1>
		<%
			}
		%>
	</div>
</body>
</html>