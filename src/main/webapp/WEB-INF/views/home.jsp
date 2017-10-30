<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
	<div align = "center">
<h1>Registration and login</h1>

	<table>
		<tr><td><a href = "${pageContext.request.contextPath}/customer/register">Register customer</a></td></tr>
		<tr><td><a href = "${pageContext.request.contextPath}/customer/login">Login customer</a></td></tr>
	</table>
</div>
</body>
</html>
