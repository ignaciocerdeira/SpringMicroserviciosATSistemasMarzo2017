<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	${requestScope.mensaje}

	<form:form action="alta" modelAttribute="persona" method="post">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><form:input path="nombre" /><form:errors path="nombre"/></td>
			</tr>
			<tr>
				<td>Edad:</td>
				<td><form:input path="edad" /><form:errors path="edad"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Guardar info" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>