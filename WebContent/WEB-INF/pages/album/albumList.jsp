<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Album List</title>
</head>
<body>
    <jsp:include page="../header.jsp"></jsp:include>
    <jsp:include page="../menu.jsp"></jsp:include>
    
    <div class="page-title" align="center">
        <h1>Album List</h1>
        <h3>
            <a href="newAlbum">New Employee</a>
        </h3>
        <table border="1">
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
 
            <c:forEach var="album" items="${listAlbums}">
                <tr>
 
                    <td>${album.id}</td>
                    <td>${album.name}</td>
                    <td>${album.price}</td>
                    <td><a href="editEmployee?id=${album.id}">Edit</a>
                             <a
                        href="deleteEmployee?id=${album.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
    
    <jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>