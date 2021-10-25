<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action=<%= request.getContextPath() %>/<%;%>>
		<p>
			Fecha de Inicio: <input type=text name="fechain" id="fechain">
		</p>
		<p>
			Fecha de Finalización: <input type=text name="fechafin" id="fechafin">
		</p>
		<p>
			Numero de Personas: <input type=text name="numpersonas" id="numpersonas">
		</p>
		<p>
			<label for="servicios"> Servicios</label>
			<input type="checkbox" value="Wifi" name="servicios" /> Wifi <br>
			<input type="checkbox" value="Toalla" name="servicios" /> Toallas <br>
			<input type="checkbox" value="Desayuno" name="servicios" /> Desayuno <br>
			<input type="checkbox" value="Limpieza" name="servicios" /> Limpieza <br>
			<input type="checkbox" value="Ruta" name="servicios" /> Ruta Guiada <br>
			<input type="checkbox" value="Sauna" name="servicios" /> Sauna <br>
		</p>
		<p>
			<input type="submit" name="submit" value="Enviar">
		</p>
	</form>
</body>
</html>