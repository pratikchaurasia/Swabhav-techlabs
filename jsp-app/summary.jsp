<html>
<body><p>
	<h1>session Counter :
	<%if(session.getAttribute("counter")!=null){
		out.println(session.getAttribute("counter"));
	}else{
		out.println("0");
	}
	
	%></h1>

	<h1>application Counter :
	<%if(application.getAttribute("counter")!=null){
		out.println(application.getAttribute("counter"));
	}else{
		out.println("0");
	}%></h1></p>
</body>
</html>