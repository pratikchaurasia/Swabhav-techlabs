<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<jsp:include page="../index.jsp" />
	<h1 align="center" class="jumbotron">Register</h1>
	<div class="form-basic container">
		<form action="register" method="post">

			<b>Name : <input type="text" class="form-group" name="user" required><br> 
			Password :<input type="password" class="form-group" id="pass" name="pwd" required> <br>
			Re-Enter Password :<input type="password" class="form-group" id="repass" name="repwd" required>
			<span id='message'></span> <br>
			<span id='val'></span> <br>
			Initial Amount : </b><input type="number" class="form-group" id="bal" name="amount" required><br>
			<div class="g-recaptcha"
			data-sitekey="6Lf9LmIUAAAAABsjac7We0-XuElg6CTURJIDjarU"></div>
			<input type="submit" class="btn btn-success" id="submit" value="Register" disabled>
			<% if(request.getAttribute("verify")!=null){
			out.println("<br><br><p style='color:red'>Login Failed</p>");
			}
			%>
		</form>
	</div>
	<script>
	$('#pass, #repass, #bal').on('keyup', function (){
		  if ($('#pass').val() == $('#repass').val()) {
		    $('#message').html('Matching').css('color', 'green');
		    if($('#bal').val()>1500)
		    	$('#submit').prop("disabled",false);
		  } else {
		    $('#message').html('Not Matching').css('color', 'red');
		    $('#submit').prop("disabled",true);
		}});
	</script>
</body>
</html>