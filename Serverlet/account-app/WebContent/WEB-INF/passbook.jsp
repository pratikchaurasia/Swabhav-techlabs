<%@page import="com.techlabs.model.Transaction"%>
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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

	<div>
		<jsp:include page="../index.jsp" />
		<h1 align="center" class="jumbotron">Pass Book</h1>
	</div>
	<div class="col-md-6">

		<%
			if ((List<Transaction>) request.getAttribute("transactions") != null) {
		%>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Amount</th>
					<th>Type</th>
					<th>Date</th>
				</tr>
			</thead>
			<%
				List<Transaction> transactionList = (List<Transaction>) request
							.getAttribute("transactions");
					for (Transaction transaction : transactionList) {
			%>
			<tr>
				<td><%=transaction.getName()%></td>
				<td><%=transaction.getAmount()%></td>
				<td><%=transaction.getType()%></td>
				<td><%=transaction.getDate()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<%
			} else {
		%>
		<h1>No Transactions.</h1>
		<%
			}
		%>
		<br> <br> <br>
		<div align="center">
			<input type="button" class="btn btn-primary btn-lg"
				value="Make a Transaction" onclick="location.href='transaction';">
		</div>
	</div>



</body>
</html>