<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Numero de Empleado</th>
				<th>Apellido</th>
				<th>Nombre</th>
				<th>Extensión</th>
				<th>Correo</th>
				<th>Código de Oficina</th>
				<th>Titulo de Trabajo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${categoria}" var="cat">
				<td>${cat.employeeNumber}</td>
				<td>${cat.lastName}</td>
				<td>${cat.firstName}</td>
				<td>${cat.extension}</td>
				<td>${cat.email}</td>
				<td>${cat.officeCode}</td>
				<td>${cat.jobTitle}</td>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>