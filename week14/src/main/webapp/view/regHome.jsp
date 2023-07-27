<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Home</title>
</head>
<body>
	<h1>Welcome to Sayem's blog</h1>
	<h2>SignUp</h2>
	<img src = "IMG_0611.jpg" style="width:300px; height:200px;" alt="">
	<h3>Enter user details to sign up</h3>
	
	<form action="register">
		<!--input type="hidden" id="id" name="id" value="1"-->
		<label for="name">Enter Name: </label>
		<input type="text" id="name" name="name"><br>
		<label for="email">Enter Email: </label>
		<input type="text" id="email" name="email"><br>
		<label for="password">Enter Password: </label>
		<input type="password" id="password" name="password"><br>
		<label for="cpassword">Confirm Password: </label>
		<input type="password" id="cpassword" name="cpassword"><br>
		<input type = submit>
	</form>
	<h3>Find data by email</h3>
	<form action="findEmail">
		<label for="email">Enter Email: </label>
		<input type="text" id="email" name="email"><br>
		<input type = submit>
	</form>
	<p>${obj.email}</p>
	<p>${obj.name}</p>
</body>
</html>