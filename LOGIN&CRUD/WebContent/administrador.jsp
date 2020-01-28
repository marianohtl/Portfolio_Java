<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Administrador</title>

<style>
body{
	background-color:black;
	}
	
	h2{
	color:white;
	text-transform:uppercase;
	}
	
	p{
		color:white;
	}
	.links{
	display:flex;
	}
	
	.links p a{
	margin-right:20px;
	text-decoration:none;
	color:white;
	}
</style>

</head>
<body>
<%
	out.println("<h2>Bem vindo administrador!</h2>");
	out.println("<p>Seu IP:"+ request.getRemoteHost()+"</p>");
	out.println("<p>Data:</h2>"+ new Date()+"</p>");
%>
<div class='links'>
	<p><a href="cadastro.html">Cadastrar Clientes</a></p>
	<p><a href="consultar.html">Alterar Cadastros</a></p>
	<p><a href="excluir.html">Excluir Usuários</a></p>
	<p><a href="read.jsp">Relatório de Clientes</a></p>
</div>


</body>
</html>