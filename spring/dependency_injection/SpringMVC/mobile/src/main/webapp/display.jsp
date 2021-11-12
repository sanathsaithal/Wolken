<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="home">HOME</a>
<table>
<tr>
	<th>BrandName</th>
	<th>ModelNo</th>
	<th>ModelName</th>
	<th>Type</th>
	<th>RAM</th>
	<th>ROM</th>
	<th>Price</th>
	<th>Availability</th>
	</tr>
	<c:forEach var="item" items="${list}">
	<tr>
	<td>${item.brandName}</td>
	<td>${item.modelNo}</td>
	<td>${item.modelName}</td>
	<td>${item.type}</td>
	<td>${item.ram}</td>
	<td>${item.rom}</td>
	<td>${item.price}</td>
	<td>${item.availability}</td>
	</tr>
	</c:forEach>
	</table>

</body>
</html>