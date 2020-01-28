<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="conecao.jsp"%>

	<%
	String idcli = request.getParameter("idcli");
	String delete = "delete from tb_cliente where idcli = ("+idcli+")";
	

		try {
		
			//abrindo a conexão
			conexao.createStatement().executeUpdate(delete);
			conexao.setAutoCommit(true);
			//direcionando ao index (comando que te leva aonde tu quer ir)
			response.sendRedirect("read.jsp");
			conexao.close();
			
		} catch (Exception e) {
			out.println(e.toString());
			conexao.close();
		}
	%>
