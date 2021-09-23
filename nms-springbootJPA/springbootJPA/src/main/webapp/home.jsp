<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>here</title>
</head>
<body>
	
	<h2>Create Operations:</h2>
	<form action = "addAlien">
		<input type = "text" name = "FID" placeholder="FID">  <br>
		<input type = "text" name = "PID" placeholder="PID"> <br>
		<input type = "text" name = "type" placeholder="Type"> <br>
		<input type = "text" name = "Name" placeholder="Name"> <br>
		<input type = "text" name = "ParentID" placeholder="Parent ID"> <br>
		<input type = "text" name = "Description" placeholder="Description"> <br>
		<input type = "submit"> <br>
	</form>
	
	<br>
	<h2>Create Operations:</h2>
	<form action = "getAlien">
		<input type = "text" name = "PID" placeholder="PID">  <br>
		<input type = "submit"> <br>
	</form>
	
</body>
</html>