<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Appointment Form</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="head">
		<h1>Add your Details First</h1>
		<form:form action="getAppointment.obj" method="post"
			modelAttribute="appointment">
			<table border="1" class="appointmentTable">
				<tr>
					<td>Patient Name</td>
					<td><form:input path="name" required="required"/></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><form:radiobutton path="gender" value="Male" label="Male" />
						<form:radiobutton path="gender" value="Female" label="Female" /></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><form:input path="mobile" required="required" /><form:errors path="mobile" /></td>
				</tr>

				<tr>
					<td>Blood Group</td>
					<td><form:input path="bloodGroup" required="required"/><form:errors path="bloodGroup" /></td>
				</tr>
				<tr>
					<td>Date of Appointment</td>
					<td><form:input path="date_my" required="required"/></td>
				</tr>
				<tr>
					<td>Select Category of Doctor Required</td>
					<td><form:select path="category">
							<form:option value="Select"></form:option>
							<form:options items="${clist }" />
						</form:select> <form:errors path="category" /></td>

				</tr>
				<tr>

					<td><input type="submit" value="Add Appointment" /> <input
						type="reset" value="Cancel"></td>
					<td><a href="home.jsp">Go Home</a><br> <br></td>
				</tr>
			</table>
		</form:form>
		</div>
</body>
</html>