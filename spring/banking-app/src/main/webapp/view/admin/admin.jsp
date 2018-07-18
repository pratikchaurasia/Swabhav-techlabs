<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<jsp:include page="index.jsp" />
	<div>

		<h1 align="center" class="jumbotron">
			Admin Portal <i class="far fa-file-alt"></i>
		</h1>
	</div>
	<div class="container">
		<table class="table table-hover" id="table">
			<thead>
				<tr>
					<th>Sr No.</th>
					<th>Name</th>
					<th>Password</th>
					<th>Account Id</th>
					<th>Balance</th>
					<th>Remove</th>
					<th>Active</th>
				</tr>
			</thead>
			<s:iterator value="users" var="user" status="incr">
				<tr>
					<td><s:property value="#incr.index+1" /></td>
					<td><a href="checkAccount?name=<s:property value="username" />"><s:property value="username" /></a></td>
					<td><s:property value="password" /></td>
					<td><s:property value="#user.Account.accountId" /></td>
					<td><s:property value="#user.Account.balance" /></td>
					<td><button id='button' class="btn btn-danger"
							onclick="location.href='remove?id=<s:property value="userId" />';">
							<i class="fas fa-trash-alt"></i>
						</button></td>
					<td><button id='button' class="btn btn-primary"
							onclick="location.href='status?id=<s:property value="userId" />';">
							<s:property value="isActive" />
						</button></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>