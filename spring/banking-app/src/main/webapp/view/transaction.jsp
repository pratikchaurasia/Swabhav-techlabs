<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction</title>
</head>
<body>
<jsp:include page="index.jsp" />
	<div>
		
		<h1 align="center" class="jumbotron">Transaction <i class="far fa-file-alt"></i></h1>
	</div>
	<div class="container">
	

		<s:form action="transaction_" method="post">
			<input type="radio" name="type" value="D" required />Deposit
			<br><input type="radio" name="type" value="W" />Withdraw
			
			<br><br><br><b>Amount : </b><input type="number" class="form-group" name="amount">
			<s:fielderror fieldName="message" style="color:red"/>
			<input type="submit" class="btn btn-success" value="submit">
		</s:form>	
	</div>
</body>
</html>