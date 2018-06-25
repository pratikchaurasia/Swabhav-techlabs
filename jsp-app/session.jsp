<html>  
<body> 
<% 
if(session.isNew()){
session.setAttribute("counter",0);
}
%>
<br>
<h1>old counter :<%=session.getAttribute("counter")%></h1><br>
<%   
	Integer counter=(Integer)(session.getAttribute("counter")); 
	counter++;
	
	session.setAttribute("counter",counter);  

%>  
<h1>new counter :<%=session.getAttribute("counter")%></h1>
<br>
<h1>Session ID :<%= session.getId() %></h1>
<br><br><br>
 
</body>  
</html>