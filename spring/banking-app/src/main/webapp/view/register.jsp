<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script src="https://www.google.com/recaptcha/api.js"></script>
</head>
<body>
<jsp:include page="index.jsp" />
	<div>
		
		<h1 align="center" class="jumbotron">Register <i class="far fa-file-alt"></i></h1>
	</div>
	<div class="form-basic container">
		<s:form action="registerUser" >

			<b>Name : <input type="text" class="form-group" name="username" required><br> 
			Password :<input type="password" class="form-group" id="pass" name="password" required> <br>
			Re-Enter Password :<input type="password" class="form-group" id="repass" name="repwd" required>
			<span id='message'></span> <br>
			<span id='val'></span> <br>
			Initial Amount : </b><input type="number" class="form-group" id="bal" name="balance" required><br>
			<div class="g-recaptcha"
			data-sitekey="6Lf9LmIUAAAAABsjac7We0-XuElg6CTURJIDjarU"></div>
			<s:fielderror fieldName="message" style="color:red"/>
			
			<input type="submit" class="btn btn-success" id="submit" value="Register" disabled>
			
		</s:form>
		
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
</body>
</html>