<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada?acao=" var="caminhoEntrada"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastre uma Nova Empresa</title>
</head>
<body>
	<c:import url="logoutParcial.jsp"></c:import>

	<form action="${caminhoEntrada}NovaEmpresa" method="post">
		Nome: <input type="text" name="nome" /></br>
		Data Abertura: <input type="text" name="data" />
		<input type="submit">
	</form>
</body>
</html>