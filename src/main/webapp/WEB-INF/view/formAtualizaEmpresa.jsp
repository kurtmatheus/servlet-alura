<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada?acao=" var="caminhoEntrada"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar Empresa</title>
</head>
<body>
	<c:import url="logoutParcial.jsp"></c:import>

	<form action="${caminhoEntrada}AtualizaEmpresa&id=${empresa.id}" method="post">
		Nome: <input type="text" name="nome" value="${empresa.nome }"/></br>
		Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/>"/>
		<input type="submit">
	</form>
</body>
</html>