<%@page import="com.techlabs.model.Transaction"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pass book</title>
</head>
<body>
<jsp:include page="../index.jsp" />
	<div>
		
		<h1 align="center" class="jumbotron">Pass Book <i class="far fa-file-alt"></i></h1>
	</div>
	<div class="col-md-8 container">

		<%
			if ((List<Transaction>) request.getAttribute("transactions") != null) {
		%>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Amount</th>
					<th>Type</th>
					<th>Date</th>
				</tr>
			</thead>
			<%
				List<Transaction> transactionList = (List<Transaction>) request
							.getAttribute("transactions");
					for (Transaction transaction : transactionList) {
			%>
			<tr>
				<td><%=transaction.getName()%></td>
				<td><%=transaction.getAmount()%></td>
				<td><%=transaction.getType()%></td>
				<td><%=transaction.getDate()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<%
			} else {
		%>
		<h1>No Transactions.</h1>
		<%
			}
		%>
		<br> 
		<div align="center">
			<input type="button" class="btn btn-primary btn-lg"
				value="Make a Transaction" onclick="location.href='transaction';"><br><br>
				<button onclick="exportTableToCSV('members.csv')" class="btn btn-success">Export To CSV <i class="fas fa-file-export"></i></button>
		</div>
	</div>

	<script >
	function downloadCSV(csv, filename) {
	    var csvFile;
	    var downloadLink;

	    csvFile = new Blob([csv], {type: "text/csv"});

	    downloadLink = document.createElement("a");

	    downloadLink.download = filename;

	    downloadLink.href = window.URL.createObjectURL(csvFile);

	    downloadLink.style.display = "none";

	    document.body.appendChild(downloadLink);

	    downloadLink.click();
	}
	function exportTableToCSV(filename) {
	    var csv = [];
	    var rows = document.querySelectorAll("table tr");
	    
	    for (var i = 0; i < rows.length; i++) {
	        var row = [], cols = rows[i].querySelectorAll("td, th");
	        
	        for (var j = 0; j < cols.length; j++) 
	            row.push(cols[j].innerText);
	        
	        csv.push(row.join(","));        
	    }
	    downloadCSV(csv.join("\n"), filename);
	}
	</script>

</body>
</html>