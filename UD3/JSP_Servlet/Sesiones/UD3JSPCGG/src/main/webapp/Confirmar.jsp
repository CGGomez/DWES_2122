<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmación | CGG 2º DAW</title>
</head>
<body>
	<h1>Reserva Confirmada:</h1>
	<p> Fecha de Inicio: <%= request.getAttribute("fechin") %></p>
	<p> Fecha de Finalización: <%= request.getAttribute("fechfin") %></p>
	<p> Total de Personas: <%= request.getAttribute("numpersonas") %></p>
	<p> Servicios Contratados: <%= request.getAttribute("servicios") %></p>
</body>
</html>