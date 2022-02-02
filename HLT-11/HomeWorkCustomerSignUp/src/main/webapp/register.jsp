<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<form action="RegisterServlet" method="post">
	Enter Name: <input type="text" name="uname"/>
	<br/>
	Enter ID: <input type="text" name="cid"/>
	<br/>
	Enter password: <input type="password" name="pass"/>
	<br/>
	Enter email: <input type="text" name="email"/>
	<br/>
	<input type="submit" value="Save"/>

</form>
</body>
</html>