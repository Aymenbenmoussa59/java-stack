<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
</head>
<body>
<h4>You have visited http://your_server <c:out value="${count}"/> times.</h4>
<a href="/your_server">Test another visit?</a>
<br/>
<a href="/your_server/countercounter">Test another visit to count par 2?</a>
<br/>
<a href="/your_server/Reset">Reset counter?</a>
</body>
</html>