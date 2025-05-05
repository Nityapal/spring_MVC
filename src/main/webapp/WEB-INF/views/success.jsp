<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page isELIgnored= "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>${Header}</h1>

	<h1>Welcome, ${user.userName}</h1>
	<h1>Your email is ${user.email}</h1>
	<h1>Password is ${user.password}, Try to secure it</h1>

</body>
</html>