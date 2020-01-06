<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<h1>Welcome to Deloitte</h1>
<h3>${loginerror}</h3>
<form action="login" method="post">
Login<input type="text" name="login" value="" /><br>
Password<input type="password" name="pswd" value="" /><br>
<input type="submit" value="LOGIN" />
</form>
</body>
</html>