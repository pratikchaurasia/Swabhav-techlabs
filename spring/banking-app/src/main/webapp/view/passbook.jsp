<%@page import="java.util.Set"%>
<%@page import="com.techlabs.entity.Account"%>
<%@page import="com.techlabs.entity.Transaction"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pass book</title>
</head>
<body>
<jsp:include page="index.jsp" />
	<div>
		
		<h1 align="center" class="jumbotron">Pass Book <i class="far fa-file-alt"></i></h1>
	</div>
	<div class="col-md-4 container text-centered" style="text-align: center;">

		<table class="table table-hover">
			<thead>
				<tr>
					<th>Amount</th>
					<th>Type</th>
					<th>Date</th>
				</tr>
			</thead>
			<%
				//Set<Transaction> transactions = (Set<Transaction>) session.getAttribute("transactions");
					//for (Transaction transaction : transactions) {
			%>
			<s:iterator value="transactions" var="item" status="incr">
					<tr>
						<td><s:property value="amount" /></td>
						<td><s:property value="type" /></td>
						<td><s:property value="date" /></td>
					</tr>
				</s:iterator>
			<%
				
			%>
		</table>
		
		<br> 
		<div align="center">
			<input type="button" class="btn btn-primary btn-lg"
				value="Make a Transaction" onclick="location.href='transaction';"><br><br>
				<button onclick="location.href='export';" class="btn btn-success">Export To CSV <i class="fas fa-file-export"></i></button>
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