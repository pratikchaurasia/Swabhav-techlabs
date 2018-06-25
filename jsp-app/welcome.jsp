<!DOCTYPE html>
<%
String name=request.getParameter("user");
if(name!=null){
	for(int i=0;i<5;i++){%>
		<h1>
		hello <%=name%>
		</h1>
<%	}
}%>
<p>Today's date: <%= (new java.util.Date()).toLocaleString()%></p></br>

<%for ( int fontSize = 4; fontSize <= 7; fontSize++){ %>
         <font color = "green" size = "<%= fontSize %>">
            Pratik
      </font><br />
      <%}%>
</b>!
</html>