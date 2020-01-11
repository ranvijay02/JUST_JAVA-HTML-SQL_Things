<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HOME</title>
</head>
<body style="background-color: yellow">
<c:choose>
<c:when test="${elist.size()>0 }">
  
<h2><center>User Login System</center></h2>
<table border="2" align="center" bgcolor="cyan">
<tr>
		<td><b>User Id</b></td>
		<td><b>User Name</b></td>
		<td><b>Password</b></td>
	</tr>
<c:forEach var="elist" items="${elist}">
<tr>
	<tr>
	<td>${elist.id}</td> 
	<td>${elist.name}</td>
	<td>${elist.password}</td>
</tr>
</c:forEach>
</table>
<br>
</c:when>
<c:otherwise>
  <h3><center>No Data Found</center></h3>
</c:otherwise>
</c:choose>
<center><a href ="goHome.obj">Go Home</a></center><br><br>
</body>
</html>