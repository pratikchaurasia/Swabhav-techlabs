<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<h1 class="jumbotron" align="center">Student Details</h1>
	<div class="container col-md-auto">

		<table class="table table-hover " align="center">
			<thead>
				<tr>
					<th>Roll no</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Address</th>
				</tr>
			</thead>
			<s:iterator value="studentList">
				<tr>
					<td><s:property value="rollNo" /></td>
					<td><s:property value="firstName" /></td>
					<td><s:property value="lastName" /></td>
					<td><s:property value="address" /></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>