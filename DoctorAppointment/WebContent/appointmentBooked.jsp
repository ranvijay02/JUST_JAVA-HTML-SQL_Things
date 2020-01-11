<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment Booked</title>
<link rel="stylesheet" type="text/css" href="style.css">
<style type="text/css">
	span{
		color: red;
	}
</style>
</head>
<body>
<h1>Your Appointment Booked for <span> Doctor ${doctorName}</span> on <span>${date}</span></h1>
<h2>Time for Your Appointment will be between <span>${sTime}</span> and <span> ${eTime}</span></h2>
<% response.setHeader("Refresh", "5 ;url=home.jsp"); %>
</body>
</html>