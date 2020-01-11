<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Athlete Registration System</title>

</head>

<body style="background-color: pink">
   <h1>Athlete Registration System</h1>
   <form:form action="submitAthlete.obj" method="post"
      modelAttribute="athlete">
      <table border="1" >
         <tr>
            <td>Athlete Name</td>
            <td><form:input path="name" /> 
            <form:errors path="name" /></td>
         </tr>
         <tr>
            <td>Gender</td>
            <td><form:radiobutton path="gender" value="Male"
                  label="Male" /> 
                <form:radiobutton path="gender"
                  value="Female" label="Female" />
                  <form:errors path="gender" /></td>
         </tr>
         <tr>
            <td>Category</td>
            <td><form:select path="category">
                  <form:option value="Select"></form:option>
                  <form:options items="${clist }"/>
               </form:select><form:errors path="category" /></td>

         </tr>
         <tr>
            <td>Email</td>
            <td><form:input path="email" /> 
            <form:errors path="email" /></td>
         </tr>
		<tr>
         <td>Mobile</td>
         <td><form:input path="mobile" /> 
         <form:errors path="mobile" /></td>
         </tr>
         <tr>
            <td><input type="submit" value="Add Athlete" />
                 <input type="reset" value="Cancel"></td>
            <td><a href ="goHome.obj">Go Home</a><br><br></td>
         </tr></table>
         </form:form>
</body>
</html>