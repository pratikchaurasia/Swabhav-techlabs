<%@page import="com.techlabs.entity.LineItem"%>
<%@page import="com.techlabs.entity.Orders"%>
<%@page import="com.techlabs.entity.Customer"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align: center;">
		<h1 class="jombotron">Order payement</h1>

		<%if (request.getSession().getAttribute("customer") != null) {
					Customer customer = (Customer) session.getAttribute("customer"); %>
				<h1> Customer name : <%=customer.getName()%></h1>	
				<h1> Orders Placed : <%=customer.getOrders().size()%></h1>	
				
				<%for (Orders o : customer.getOrders()) {%>
					<h1> Orders price : <%=o.getTotalPrice()%></h1>
					<%for (LineItem i : o.getItems()) {%>
						<h1> Product Name : <%=i.getProduct().getName()%></h1>
						<h1> Product Price : <%=i.getProduct().getPrice()%></h1>
	
					<%	}		
					}
				}
				 %>

	</div>
</body>
</html>