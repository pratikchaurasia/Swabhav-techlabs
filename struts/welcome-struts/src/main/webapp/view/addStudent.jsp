<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>

</head>
<body>

	<s:form action="addStudents">
		<s:textfield type="number" name="student.id" label="Roll No" />
		<s:textfield name="student.name" label="Name"  size="20" />

		<s:textfield name="student.address" label="Address" 
			size="20" />
		<s:submit name="submit" label="Submit" 
			align="center" />
	</s:form>
	<a href='<s:url action='students' ></s:url>' class="btn btn-primary">Show
		Students</a>

</body>
</html>