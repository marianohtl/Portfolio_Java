<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usu�rio</title>
</head>
<body>
<%
	out.println("<h2>Bem vindo usu�rio!</h2>");
	out.println("<p>Seu IP:"+ request.getRemoteHost()+"</p>");
	out.println("<p>Data:</h2>"+ new Date()+"</p>");
%>
</body>
</html>