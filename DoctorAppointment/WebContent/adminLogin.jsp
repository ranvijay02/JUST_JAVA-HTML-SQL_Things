<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Admin Login</h1>
	<form action="checkAdmin.obj" method="POST">
		<table border="5" style="padding: 2px" class="admin">
			<tr>
				<td>Enter the Admin Pin</td>
				<td><input type="password" name="pin" style="padding: 5px"></td>
			</tr>
			<tr>
            <td style="align-content: center;"><input type="submit" value="Login" style="padding: 7px; border-radius: 5px; width: 132px"/></td>
            <td><a href ="home.jsp">Go Back</a><br><br></td>
         </tr>
		</table>
	</form>
</body>
</html>