<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addProg">
		<fieldset>
		<legend><b>Enter Programmer Data</b></legend>
			<label for = "id">Enter id: </label>
			<input id = "id" type = "text" name="id"><br>
			<label for = "name">Enter name: </label>
			<input id = "name" type = "text" name="name"><br>
			<label for = "language">Enter Programming Language: </label>
			<input id = "language" type = "text" name="language"><br>
			<input type = "submit">
		</fieldset>
	</form>
	<form action="searchProg">
		<fieldset>
		<legend><b>Search Programmer by Id</b></legend>
			<label for = "id">Enter id to search: </label>
			<input id = "id" type = "text" name="id"><br>
			<input type = "submit">
		</fieldset>
	</form>
	<form action="searchProgName">
		<fieldset>
		<legend><b>Search Programmer by Name</b></legend>
			<label for = "name">Enter name to search: </label>
			<input id = "name" type = "text" name="name"><br>
			<input type = "submit">
		</fieldset>
	</form>
</body>
</html>