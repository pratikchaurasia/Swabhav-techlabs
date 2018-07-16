<%@page import="java.sql.SQLException"%>
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
		<h1 align="center" class="jumbotron">Transaction</h1>
	</div>
	<div class="container">
	

		<form action="transaction" method="post">
			<input type="radio" name="type" value="D" required />Deposit
			<br><input type="radio" name="type" value="W" />Withdraw
			
			<br><br><br><b>Amount : </b><input type="number" class="form-group" name="amount">
			<input type="submit" class="btn btn-success" value="submit">

		</form>
		<%if(request.getAttribute("message")!=null){%>
		<h6 style=color:red><%=request.getAttribute("message")%></h6>
	<%} %>
	</div>

</body>
</html>