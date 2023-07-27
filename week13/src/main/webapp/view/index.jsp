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
	<h2>Displaying records of Employee Ms.${obj.name}</h2>
	
	<form action="save">
		<label for="id">Enter id: </label>
		<input type = "text" id = "id" name = "id"><br><br>
		<label for="name">Enter Name: </label>
		<input type = "text" id = "name" name = "name"><br><br>
		<label for="Designation: ">Enter designation: </label>
		<input type = "text" id = "designation" name = "designation"><br>
		<br><br>
		<input type="submit">
	</form>
	
	<h2>Delete Record</h2>
	<form action="save">
		<label for="id">Enter id to delete: </label>
		<input type = "text" id = "id" name = "id"><br><br>
		<input type="submit">
	</form>
	
	<p>${msg}</p>
	<!--  p>Id: ${obj.id}</p>
	<p>Name: ${obj.name}</p>
	<p>Designation: ${obj.designation}</p-->
</body>
</html>