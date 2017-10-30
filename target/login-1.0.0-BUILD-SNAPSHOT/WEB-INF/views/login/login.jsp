<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<html>
<head>
<title>Login page</title>
</head>
<body>
	<div align = "center">
		<h1>Login to system</h1>
		
		
		<table>
			<s:form commandName = "customerData"
			action = "${pageContext.request.contextPath}/customer/login" method = "post">
			<tr>
				<td>Customer email</td>
				<td><s:input path = "customerMail" /></td>
			</tr>
			<tr>
				<td>Customer password</td>
				<td><s:input path = "customerPassword"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type = "sumbit" value = "Login"></td>
			</tr>
			</s:form>
			<tr>
			<td></td>
				<td><a href = "${pageContext.request.contextPath}/customer/register">Registration</a>
				<a href = "${pageContext.request.contextPath}/">Home page</a></td>
			</tr>
		</table>
		<div></div>
		<div>
			<p style = "color:red;">${failed}</p>
		</div>
	</div>
</body>
</html>