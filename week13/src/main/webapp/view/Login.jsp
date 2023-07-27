<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to our website</h1>
	<h2>Please enter login details below:</h2>
	
	<form action="verifyLogin">
		<label for="email">Enter email: </label>
		<input type = "text" id = "email" name = "email">
		<label for="pass">Enter Password: </label>
		<input type = "password" id = "pass" name = "pass">
		<input type="submit">
	</form>
	<p>${msg}</p>
</body>
</html>