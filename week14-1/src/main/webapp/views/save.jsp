<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<<h1>Records are</h1>
<form action="saveProgrammer">
<label for ="id"> id:</label>
<input type ="text" id="id" name="id"><br><br>
<label for ="id">Enter Name:</label>
<input type ="text" id="name" name="name"><br><br>
<label for ="id">Enter language:</label>
<input type ="text" id="language" name="language"><br><br>
<br><br>
<input type ="submit" >
</form>
<h1>search Programmer by id </h1>
<form action="searchProgrammer">
<label for ="id"> id:</label>
<input type ="text" id="id" name="id"><br><br>
<br><br>
<input type ="submit" >
</form>

<h1>search Programmer by name </h1>
<form action="searchByName">
<label for ="name"> id:</label>
<input type ="text" id="name" name="name"><br><br>
<br><br>
<input type ="submit" >
</form>
<h1>Delete Programmer by id </h1>
<form action="deleteProgrammer">
    <label for="id">id:</label>
    <input type="text" id="id" name="id"><br><br>
    <br><br>
    <input type="submit">
</form>

<h1>add Programmer</h1>
<form action="addProgrammer">
    <label for="id">id:</label>
    <input type="text" id="id" name="id"><br><br>
    <label for="name">Enter Name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="language">Enter Language:</label>
    <input type="text" id="language" name="language"><br><br>
    <br><br>
    <input type="submit">
    </form>
<h1>Update Programmer</h1>
<form action="updateProgrammer">
    <label for="id">id:</label>
    <input type="text" id="id" name="id"><br><br>
    <label for="name">Enter Name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="language">Enter Language:</label>
    <input type="text" id="language" name="language"><br><br>
    <br><br>
    <input type="submit">
</form>
</body>
</html>