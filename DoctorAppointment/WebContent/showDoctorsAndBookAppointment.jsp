<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<c:choose>
<c:when test="${elist.size()>0 }">
  
<h2><center>Book Your Appointment</center></h2>
<table border="2" align="center" bgcolor="cyan">
<tr>
		<td><b>Doctor Id</b></td>
		<td><b>Doctor Name</b></td>
		<td><b>Gender</b></td>
		<td><b>Category</b></td>
		<td><b>Email</b></td>
		<td><b>Mobile</b></td>
		<td><b>Start Time</b></td>
	</tr>
<c:forEach var="elist" items="${elist}">
<tr>
	<tr>
	<td>${elist.id}</td> 
	<td>${elist.name}</td>
	<td>${elist.gender}</td>
	<td>${elist.category}</td>
	<td>${elist.email}</td>
	<td>${elist.mobile}</td>
	<td>${elist.sTime}</td>
	<td><form action="setDoctorId.obj" method="post"><input type="text" value="${elist.id}" name="doctor_id" style="visibility: hidden;">
	<input type="text" value="${patientId}" name="patient_id" style="visibility: hidden;">
	<input type="text" value="${date}" name="date" style="visibility: hidden;">
	<input type="submit" value="Book Appointment"></form></td>
	
</tr>
</c:forEach>
</table>
<br>
</c:when>
<c:otherwise>
  <h3><center>No Data Found</center></h3>
</c:otherwise>
</c:choose>
<center><a href ="home.jsp">Go Home</a></center><br><br>

</body>
</html>