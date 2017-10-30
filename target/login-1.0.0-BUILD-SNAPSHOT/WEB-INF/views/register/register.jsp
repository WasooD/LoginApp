<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<html>
<head>
<title>Registration</title>
</head>
<body>
	<div align = "center">
		<h1>Register new customer</h1>

		<table>
			<s:form commandName = "customerData"
			action = "${pageContext.request.contextPath}customer/register" method = "post">
			<tr>
				<td>Customer name</td>
				<td><s:input path = "customerName" /></td>
				<td><s:errors path = "customerName" cssStyle = "color:red;" /></td>
			</tr>
			<tr>
				<td>Customer mobile number</td>
				<td><s:input path = "customerMobile" /></td>
				<td><s:errors path = "customerMobile" cssStyle = "color:red;" /></td>
			</tr>
			<tr>
				<td>Customer gender</td>
				<td><s:input path = "customerGender" value = "Male" name = "gender" /></td>
				<td><s:input path = "customerGender" value = "Female" name = "gender" /></td>
				<td><s:errors path = "customerGender" cssStyle = "color:red;" /></td>
			</tr>
			<tr>
				<td>Customer email</td>
				<td><s:input path = "customerEmail" /></td>
				<td><s:errors path = "customerEmail" cssStyle = "color:red;" /></td>
			</tr>
			<tr>
				<td>Customer password</td>
				<td><s:input path = "customerPassword" /></td>
				<td><s:errors path = "customerPassword" cssStyle = "color:red;" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type = "sumbit" value = "Register" /></td>
			</tr>
			</s:form>
		</table>
	</div>
</body>
</html>