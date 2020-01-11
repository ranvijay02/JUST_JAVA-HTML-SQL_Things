<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Appointment Home</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<fieldset >
		<h1>Admin Home</h1>
		<br> <a href="registerDoctor.obj">Add a Doctor</a><br>
		<br> <a href="allDoctors.obj">View all Doctors</a><br>
		<br> <a href="checkAppointments.obj">View all Appointments</a>
		<br> <a href="home.jsp">Go to Home</a><br>
	</fieldset>
</body>
</html>