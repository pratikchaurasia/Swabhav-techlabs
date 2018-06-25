<html>
<body>
<% if(application.getAttribute("counter")==null){
	application.setAttribute("counter",0);
}%>
old counter :<%=application.getAttribute("counter")%>
<%
Integer counter=(Integer)application.getAttribute("counter");
counter++;
application.setAttribute("counter",counter);
%>
new counter :<%=application.getAttribute("counter")%>
</body>
</html>
