<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.1.0/css/all.css"
	integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt"
	crossorigin="anonymous">

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light justify-content-between">
	<div class="col-sm-3">
		<a class="navbar-brand" href="#">P Bank</a>
	</div>
	<div class="col-md-3  col-sm-1 justify-content-right">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div
			class="collapse navbar-collapse navbar-inverse justify-content-right"
			id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link" href="index.jsp">Home<i
					class="fas fa-home"></i></a> <a class="nav-item nav-link"
					href="register">Register</a>
	
					<%
						String username = (String) session.getAttribute("userName");
						if (username != null) {
					%>
					<a class="nav-item nav-link " style="float: right !important"
						href="logout">Logout <i class="fas fa-sign-out-alt"></i></a> <a
						class="nav-item nav-link " style="float: right !important"><%=username%>
						<i class="fas fa-user-alt"></i></a>

					<%
						} else {
					%>
					<a class="nav-item nav-link " href="login">Login <i
						class="fas fa-sign-in-alt"></i>
					</a> <a class="nav-item nav-link " style="float: right">Guest <i
						class="fas fa-user-alt"></i></a>
					<%
						}
					%>
			
			</div>
		</div>
	</div>
	</nav>
</body>
</html>