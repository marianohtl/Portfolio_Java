<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Módulo de Conexão</title>
</head>
<body>
<%
	java.sql.Connection conexao = null;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/dbloginjsp?useTimezone=true&serverTimezone=UTC";
	String user = "root";
	String password = "";
	try{
		Class.forName(driver);
		conexao = DriverManager.getConnection(url,user, password);
		out.println("Conectado.");
	}catch(Exception e){
		e.printStackTrace();
		out.print(e);
	}
%>
