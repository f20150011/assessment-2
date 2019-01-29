<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assessment 2</title>
</head>
<body>
	<h1>
		Sapient Assessment 2
	</h1>
	<form action="test" method="post">
		Name: <input name="name" /> 
		College: <input name="college" />
		Weight: <input name="weight" /> 
		Role: 
		<select>
		<option> HR </option>
		<option> SDE </option>
		<option> SDE-Test </option>
		<option> QA </option>
		</select>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>