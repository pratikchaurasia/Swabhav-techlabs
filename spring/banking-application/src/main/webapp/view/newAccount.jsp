<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Account</title>
<script src="https://www.google.com/recaptcha/api.js"></script>
</head>
<body>
	<jsp:include page="index.jsp" />
	<div>

		<h1 align="center" class="jumbotron">
			Create Account <i class="far fa-file-alt"></i>
		</h1>
	</div>
	<div class="form-basic container">
		<s:form action="createAccount">
		Account Type :   
			<input type="radio" name="type" value="S" required />Saving
			<input type="radio" name="type" value="C" />Current
			<br>
			<br>Initial Amount : </b>
			<input type="number" class="form-group" id="bal" name="balance"
				required>
			<br>
			<s:fielderror fieldName="message" style="color:red" />

			<input type="submit" class="btn btn-success" id="submit"
				value="Register" disabled>
		</s:form>

	</div>
	<script>
		$('#bal').on('keyup', function() {
			if ($('#bal').val() > 1500)
				$('#submit').prop("disabled", false);
		});
	</script>

</body>
</html>