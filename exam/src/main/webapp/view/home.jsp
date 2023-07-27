<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add books</title>
	<style>
	table, th, td {
	  border:1px solid black;
	}
	</style>
</head>
<body>
	<h1>Add Books</h1>
	<form action="addBooks">
		<label for="id">Enter id: </label>
		<input type = "text" id = "id" name = "id"><br><br>
		<label for="title">Enter Title: </label>
		<input type = "text" id = "title" name = "title"><br><br>
		<label for="author">Enter Author: </label>
		<input type = "text" id = "author" name = "author"><br>
		<label for="isbn">Enter ISBN: </label>
		<input type = "text" id = "isbn" name = "isbn"><br>
		<label for="pDate">Enter Publication Date: </label>
		<input type = "text" id = "pDate" name = "pDate"><br>
		<br><br>
		<input type="submit">
	</form>
	<h2>TR elements define table rows</h2>

	<table style="width:100%">
	  <tr>
	  	<td>S.No</td>
	    <td>Id</td>
	    <td>Title</td>
	    <td>Author</td>
	    <td>ISBN</td>
	    <td>Publication Date</td>
	    <td>Action</td>
	  </tr>
	  <script>
		for (let i = 0; i < cars.length; i++) {
  			text += cars[i] + "<br>";	
	  <tr>
	    <td></td>
	    <td>${book.id}</td>
	    <td>${book.title}</td>
	    <td>${book.author}</td>
	    <td>${book.isbn}</td>
	    <td>${book.pDate}</td>
	    <td>
			<input type="submit" name = "Edit">
			<input type="submit" name = "Delete">
		</td>
	  </tr>
		}
	  </script>
	</table>

		
</body>
</html>