<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Central de Viajes |CGG 2º DAW </title>
</head>
<body>
	<h1>Central de Viajes</h1>
	<form method="post" action=<%= request.getContextPath() %> /ReservarServlet>
		<p>
			Usuario<input type=text name="usuario" id="usuario">
		</p>
		<p>
			Contraseña<input type=text name="pass" id="pass">
		</p>
		<p>
			Confirmación Contraseñas<input type=text name="passcon" id="passcon">
		</p>
		<p>
			Correo<input type=text name="email" id="email">
		</p>
		
		<p>
			<input type="button" name="submit" value="Registrarse">
		</p>
	</form>
</body>
</html>