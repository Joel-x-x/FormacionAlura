<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<% String empresa = (String) request.getAttribute("empresa"); %>
<body>
	<!-- <h1>Empresa <% //out.println(empresa); %> registrada!</h1> -->
	<h1>Empresa <%= empresa %> registrada!</h1>
</body>
</html>