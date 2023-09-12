<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
	<h3>Send an Omikuji!</h3>
	<form action='/omikuji/show' method='GET'>
		<label>Pick any number form 5 to 25:</label>
		<input type="number" name="pick" min="5" max="25"> 
		 <label>Enter the name	of any city:</label> 
		<input type="text" name='city'> 
		<label>Enter the name	of any real person:</label> 
		<input type="text" name='nameperson'> 
		<label>Enter professional endeavor or hobby:</label> 
		<input type='text' name='profision'>
		<label>Enter any type of living thing:</label> 
		<input type='text' name='type'> 
		<label>Say something nice to someone:</label>
		<textarea name='Say'></textarea>

		<input type='submit' value='Send'>
	</form>
</body>
</html>