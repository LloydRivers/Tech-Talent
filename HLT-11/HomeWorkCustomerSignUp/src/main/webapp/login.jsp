<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login</title>
</head>
<body>
<form action="LoginServlet" method="post">
User Name:<input type="text" name="uname"/>
<br>
Password:<input type="password" name="pass"/>
<br>
<input type="submit" value="Login"/>
</form>
</body>
</html>