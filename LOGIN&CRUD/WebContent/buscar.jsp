<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="conecao.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulta</title>
</head>
<body>
	<h2>Consulta de Clientes</h2>
	<%
	String busca = request.getParameter("busca");
		try {

			Statement st = conexao.createStatement();
			String read = "select * from tb_cliente where idcli='"+busca+"'";
			ResultSet rs = st.executeQuery(read);

			while (rs.next()) {
			%>
			<form action="alteracao.jsp">
	<table>
			<tr>
				<td>id: </td>
				<td><input type="text" name="idcli" size="5" value="<%out.println(rs.getString(1));%>"></td>
			</tr>
			<tr>
				<td>Nome: </td>
				<td><input type="text" name="nome" size="50" value="<%out.println(rs.getString(2));%>"></td>
			</tr>
			<tr>
				<td>Fone:</td>
				<td><input type="text" name="fone" size="15" value="<%out.println(rs.getString(3));%>"></td>
			</tr>
			<tr>
				<td>E-mail:</td>
				<td><input type="text" name="email" size="50" value="<%out.println(rs.getString(4));%>"></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type="text" name="senha" size="15" value="<%out.println(rs.getString(5));%>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="ALTERAR"" action="alteracao.jsp" ></td>
			</tr>
	</table>
</form>
			

			<%}
			conexao.close();
		} catch (Exception e) {
			out.println(e.toString());
		}
	%>
</body>
</html>