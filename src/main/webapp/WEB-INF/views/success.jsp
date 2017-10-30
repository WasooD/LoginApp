<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<html>
<head>
<title>Welcome</title>
</head>
<body>

	<h1></h1>
	<div>
		<div align = "right">
			<a href = "${pageContext.request.contextPath}/customer/logout"><b>Log out</b></a>
		</div>
		<div align = "left">
			Welcome<b style = "color:red;">${customer.customerName}</b>
		</div>
	</div>
	<div aligh = "center">
		<table>
			<tr>
				<td>Customer Name</td>
				<td>${customer.customerName}</td>
			</tr>
			<tr>
				<td>Customer mobile number</td>
				<td>${customer.customerMobile}</td>
			</tr>
			<tr>
				<td>Customer gender</td>
				<td>${customer.customerGender}</td>
			</tr>
			<tr>
				<td>Customer Email</td>
				<td>${customer.customerMail}</td>
			</tr>
			<tr>
				<td>Customer password</td>
				<td>${customer.customerPassword}</td>
			</tr>
		</table>
	</div>
</body>
</html>