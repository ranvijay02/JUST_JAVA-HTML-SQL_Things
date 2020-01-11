<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment List</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<c:choose>
<c:when test="${elist.size()>0 }">
  
<h2><center>List of Appointments</center></h2>
<table border="2" align="center" bgcolor="cyan" class="appointmentList">
<tr>
		<td><b>Appointment Id</b></td>
		<td><b>Name</b></td>
		<td><b>Blood Group</b></td>
		<td><b>Category</b></td>
		<td><b>Doctor Id</b></td>
		<td><b>Patient Gender</b></td>
		<td><b>Mobile</b></td>
</tr>
<c:forEach var="elist" items="${elist}">
<tr>
	
		<td>${elist.id}</td> 
		<td>${elist.name}</td>
		<td>${elist.bloodGroup}</td>
		<td>${elist.category}</td>
		<td>${elist.doctor_id}</td>
		<td>${elist.gender}</td>
		<td>${elist.mobile}</td>
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