<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="box">
	<h1>Here's Your Omikuji!</h1>
	<h3>
	In <c:out value="${pick}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${nameperson}"/>
	as your roommate, <c:out value="${profision}"/> for a living.
	The next time you see a <c:out value="${type}"/>, you will have good luck.
	Also, <c:out value="${Say}"/>.
	</h3>
	<a href="/">Go Back</a>
</div>
</body>
</html>