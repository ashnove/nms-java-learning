<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>here</title>
</head>
<body>
	
	<form action = "addAlien">
		<input type = "text" name = "FID" placeholder="FID">  <br>
		<input type = "text" name = "PID" placeholder="PID"> <br>
		<input type = "text" name = "Type" placeholder="Type"> <br>
		<input type = "text" name = "Name" placeholder="Name"> <br>
		<input type = "text" name = "ParentID" placeholder="Parent ID"> <br>
		<input type = "text" name = "Desciption" placeholder="Desciption"> <br>
		<input type = "submit"> <br>
	</form>
	
	<br>
	<form action = "getAlien">
		<input type = "text" name = "aid" placeholder="aid">  <br>
		<input type = "submit"> <br>
	</form>
	
</body>
</html>