<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<h1>Error Occured... Going to home in 5 Seconds</h1>
	<% response.setHeader("Refresh", "5;url=home.jsp"); %>
</body>
</html>