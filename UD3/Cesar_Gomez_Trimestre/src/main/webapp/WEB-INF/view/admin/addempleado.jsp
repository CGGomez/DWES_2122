<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="post">
		<label for="employeeNumber" class="from-label"></label>
		<input name="en" value="${cat.employeeNumber}" type="text" class="form-control" id="employeeNumber">
		<label for="lastName" class="from-label"></label>
		<input name="ln" value="${cat.lastName}" type="text" class="form-control" id="lastName">
		<label for="firstName" class="from-label"></label>
		<input name="fn" value="${cat.firstName}" type="text" class="form-control" id="firstName">
		<label for="extension" class="from-label"></label>
		<input name="ex" value="${cat.extension}" type="text" class="form-control" id="extension">
		<label for="email" class="from-label"></label>
		<input name="em" value="${cat.email}" type="text" class="form-control" id="email">
		<label for="officeCode" class="from-label"></label>
		<input name="oc" value="${cat.officeCode}" type="text" class="form-control" id="officeCode">
		<label for="reportsTo" class="from-label"></label>
		<input name="rt" value="${cat.reportsTo}" type="text" class="form-control" id="reportsTo">
		<label for="jobTitle" class="from-label"></label>
		<input name="jt" value="${cat.jobTitle}" type="text" class="form-control" id="jobTitle">
	</form>
</body>
</html>