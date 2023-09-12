<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Share</title>
</head>
<body>
<h1>All Books</h1>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="onebook">
   		<tr>
   			<td><a href="/show/books/onebook.id"><c:out value="onebook.title"/></a></td>
   			<td><c:out value="onebook..description"/></td>
	        <td><c:out value="onebook.language"/></td>
			<td><c:out value="onebook.numberOfPages"/></td>
   		</tr>
   	</c:forEach>
    </tbody>
</table>
	
</body>
</html>