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
	<form action="${caminhoEntrada}Login" method="post">
		Login: <input type="text" name="login" /></br>
		Senha: <input type="password" name="senha" />
		<input type="submit">
	</form>
</body>
</html>