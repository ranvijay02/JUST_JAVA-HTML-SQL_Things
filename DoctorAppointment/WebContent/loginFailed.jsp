<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failed</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<h1>Login Failed ... You will be redirected after 5 Seconds..</h1>
	<% response.setHeader("Refresh", "5;url=home.jsp"); %>
</body>
</html>