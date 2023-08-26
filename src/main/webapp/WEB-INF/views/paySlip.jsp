<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ page import="com.employee.model.EmployeeModel" %>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">
				<title>PaySlip</title>
				<style>
					html,
					body {
						height: 100%;
						width: 100%;
					}

					th,
					td {
						padding: 10px;
					}

					header,
					footer {
						display: block;
					}
				</style>
			</head>

			<body>
				<header>
					<h1>Pay Sheet</h1>
				</header><br>
				<table border="1">
					<tr>
						<th>Employee Id</th>
						<th>Employee Name</th>
						<th>Pay Days (Month)</th>
						<th>Gross</th>
						<th>Basic</th>
						<th>HRA</th>
						<th>Variable Allowance</th>
						<th>Pay Amount</th>
					</tr>
					<c:forEach items="${employeeView}" var="ps">
						<tr>
							<td>${ps.employee.id}</td>
							<td>${ps.employee.name}</td>
							<td>${ps.employee.payDays} (${ps.employee.month})</td>
							<td>${ps.gross}</td>
							<td>${ps.basic}</td>
							<td>${ps.hra}</td>
							<td>${ps.variableAllowance}</td>
							<td>${ps.amount}</td>
						</tr>
					</c:forEach>
				</table><br>
				<footer>
					<button id="print">Print</button>
					<a href="/employee/employee" type="button" style="text-decoration: none; color: black;">Back</a>
				</footer>
			</body>
			<script type="text/javascript">
				document.getElementById("print").addEventListener("click", function () {
					window.print();
				});
			</script>

			</html>