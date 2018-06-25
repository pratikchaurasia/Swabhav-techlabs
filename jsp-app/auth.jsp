<!DOCType html>
<%	
	String user="pratik";
	String pwd="123";
	
	
	String userName=request.getParameter("name");
	String password=request.getParameter("password");
	
	
	
	if(user.equals(userName)&&pwd.equals(password)){
	
		out.println("user name := "+userName);
		out.println("Password := "+password);
	}
	else{
		response.sendRedirect("login.html");
	}
%>
</html>