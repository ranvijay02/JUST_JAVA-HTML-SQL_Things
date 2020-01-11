<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Successfully Added... Redirection after 5 seconds</h1>
	<% response.setHeader("Refresh", "5 ;url=admin.jsp"); %>
</body>
</html>