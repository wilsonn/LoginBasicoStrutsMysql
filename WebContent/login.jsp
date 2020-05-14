<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>

<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%--     <link rel="stylesheet" href="<%=request.getContextPath()%>/libs/bootstrap-3.3.6/css/bootstrap.min.css"/> --%>
<%--     <script src="<%=request.getContextPath()%>/libs/jquery-1.12.4/jquery-1.12.4.min.js"></script> --%>
<%--     <script src="<%=request.getContextPath()%>/libs/bootstrap-3.3.6/js/bootstrap.min.js"></script> --%>
	<title>Login Usuario</title>

</head>

<body>

	<html:form action="/validateLogin.do">
	
		<table  align="center">
		
			<tr>
				<td colspan="2" style="font-weight: bold; size: 20px;">Ingresa tu Usuario y tu Contraseña</td>
			</tr>
			<tr>
				<td style="font-weight: bold; size: 12px; color: blue;" align="right">Usuario: </td>
				<td>
					<html:text property="user"></html:text>
				</td>
			</tr>
			<tr>
				<td style="font-weight: bold; size: 12px; color: blue;" align="right">Contraseña: </td>
				<td>
					<html:password property="password"></html:password>
				</td>
			</tr>
			<tr>
				<td><input type="button" value="Cancelar" style="size: 14px; color: blue;"> </td>
				<td>
					<input type="submit" value="Aceptar" style="size: 14px; color: blue;">
				</td>
			</tr>
			
		</table>
		
	</html:form>

</body>

</html>