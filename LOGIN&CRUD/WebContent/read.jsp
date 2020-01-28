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
		try {

			Statement st = conexao.createStatement();
			String read = "select * from tb_cliente";
			ResultSet rs = st.executeQuery(read);

			while (rs.next()) {%>

			<table width="600" border="1">
				<tr>
					<td width="20"><%out.println(rs.getString(1));%></td>
					<td width="200"><%out.println(rs.getString(2));%></td>
					<td width="100"><%out.println(rs.getString(3));%></td>
					<td width="200"><%out.println(rs.getString(4));%></td>
					<td width="80"><%out.println(rs.getString(5));%></td>
				</tr>
			</table>

			<%}
			conexao.close();
		} catch (Exception e) {
			out.println(e.toString());
		}
	%>
	
		<p><a href="administrador.jsp">Voltar ao Perfil</a></p>
</body>
</html>