<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.1.0/css/all.css"
	integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#productList').on('change', function() {
			var formInput = $('#itemForm').serialize();
			$.getJSON('getTotalCost', formInput, function(data) {
				$('#totalCost').val(data);
			});
		});
		$('#quantity').on('change keyup', function() {
			var formInput = $('#itemForm').serialize();
			$.getJSON('getTotalCost', formInput, function(data) {
				$('#totalCost').val(data);
			});
		});
	});
</script>
</head>
<body>


	<h1 align="center" class="jumbotron">Select Product</h1>
	<div class="col-md-11">
		<form action="logout" method="get">
			<%
				if (request.getSession().getAttribute("userName") != null) {
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
	<div class="container">
		<s:form action="add" class="col-md-8" method="post" id="itemForm">
			<select name="selected" class="form-control" id="productList">
				<s:iterator value="productList">
					<option value="<s:property value="id" />"><s:property
							value="name" /></option>
				</s:iterator>
			</select>
			<br>
			<label>Quantity : </label>
			<input type="number" placeholder="Enter Number of Products"
				name="quantity" class="form-control" required min="0" id="quantity" />
			<br>
			<div class="col-sm-4 input-group">
				<div class="input-group-prepend">
					<span class="input-group-text" id="inputGroup-sizing-default">Price</span>
				</div>
				<input type="text" id="totalCost" name="totalCost" readonly
					class="form-control" value="<s:property value="totalCost"/>" />
			</div>

			<div style="text-align: center;">
				<input type="submit" id="submit" onclick="myfunction()"
					value="Add To Cart" class="btn btn-primary" style="float:;" />
			</div>
		</s:form>

		<br>
		<%
			if (request.getSession().getAttribute("userName") != null) {
		%>
		<div class="col-md-8" style="text-align: center;">
			<div class="row">
				<div class="col-md-12">
					<hr />
				</div>
			</div>
			<br>
			<h1 align="center" style="font-family: cursive;">Cart</h1>
			<input type="hidden" name="display" />
			<table class="table table-hover" id="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Product</th>
						<th>Price</th>
						<th>Quantity</th>
						<th>TotalCost</th>
						<th>Remove</th>
					</tr>
				</thead>
				<s:iterator value="lineItem" var="item" status="incr">
					<tr>
						<td><s:property value="#incr.index+1" /></td>
						<td><s:property value="#item.Product.name" /></td>
						<td><s:property value="#item.Product.price" /></td>
						<td><s:property value="quantity" /></td>
						<td><s:property value="totalCost" /></td>
						<td><button id='button' class="btn btn-danger"
								onclick="location.href='remove?id=<s:property value="id" />';">
								<i class="fas fa-trash-alt"></i>
							</button></td>

					</tr>
				</s:iterator>
			</table>
		</div>
		<div class="col-lg-12">
			<div class="row">
				<div class="col-md-8">
					<button id='button' class='btn btn-success btn-lg' value="id"
						style="margin: auto; display: block"
						onclick="location.href='checkout';">
						<i class="fas fa-shopping-cart"></i> Check Out
					</button>
				</div>
			</div>
		</div>
		<%
			}
		%>
	</div>
</body>
</html>