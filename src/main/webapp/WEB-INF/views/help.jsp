<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored= "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	
	<%-- <%
		
		String name= (String)request.getAttribute("name");
		LocalDateTime time= (LocalDateTime)request.getAttribute("time");
	
	%> --%>
	
	<h1>This is help page</h1>
	<%-- <h1> <%= name %> here..</h1>
	<h1>Date and Time is <%= time.toString() %> </h1> --%>
	
	
	<h1>Hello my name is ${name} </h1>
	<h1>date&time is ${time}</h1>
	<hr>
	<%-- <h1>${marks}</h1> --%>
	<c:forEach var="item" items="${marks}">
		<p>${item}</p>
		<%-- <c:out value="${item}"></c:out> --%>
	</c:forEach>
	
</body>
</html>