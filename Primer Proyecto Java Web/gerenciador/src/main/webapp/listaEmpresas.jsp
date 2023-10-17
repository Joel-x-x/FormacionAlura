<%@page import="java.util.List"%>
<%@page import="com.alura.gerenciador.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Empresas</title>
</head>
<body>
	
	<% var listaEmpresas = (List<Empresa>) request.getAttribute("empresas"); %>
	
	<% for(Empresa empresa : listaEmpresas) { %>
	<h1>
		<%= empresa.getNombre() %>
	</h1>		
	<% } %>
	
	
</body>
</html>