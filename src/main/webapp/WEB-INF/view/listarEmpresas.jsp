<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada?acao=" var="caminhoEntrada" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresas</title>
</head>
<body>
	<c:import url="logoutParcial.jsp"></c:import>
	<h5>Usuário Logado: ${usuarioLogado.login }</h5>
	
	<c:if test="${not empty empresa }">
		<h4>Empresa ${empresa.nome} Cadastrada com sucesso!</h4>
	</c:if>
	<h2>Lista de Empresas Adicionadas</h2>
	<ul>
		<c:forEach items="${empresas}" var="e">
			<li>
			${e.nome } - <fmt:formatDate value="${ e.dataAbertura }" pattern="dd/MM/yyyy"/> 
			<a href="${caminhoEntrada}RemoveEmpresa&id=${e.id}">Remover</a>
			<a href="${caminhoEntrada}ExibeEmpresa&id=${e.id}">Atualizar</a>
			</li>
		</c:forEach>
	</ul>
	
	<button><a href="${caminhoEntrada}NovaEmpresaForm">Adicionar Nova Empresa</a></button>
</body>
</html>