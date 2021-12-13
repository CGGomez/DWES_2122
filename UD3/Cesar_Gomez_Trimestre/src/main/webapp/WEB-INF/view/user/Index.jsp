<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Categorías Disponibles</h1>
		<c:when test="${empleados!=null and productos.size()>0}">
			<ul>
				<c:forEach items="${Empleados}" var="e">
					<li><a>${e.employeeNumber}</a></li>
					<li>${e.lastName}</li>
					<li>${e.firstName}</li>
					<li>${e.extension}</li>
					<li>${e.email}</li>
					<li>${e.officeCode}</li>
					<li>${e.reportsTo}</li>
					<li>${e.jobTitle}</li>
				</c:forEach>
			</ul>
		</c:when>
</body>
</html>