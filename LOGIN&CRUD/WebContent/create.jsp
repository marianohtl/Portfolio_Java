<%//A linha abaixo importa o módulo de conexão  %>
<%@ include file="conecao.jsp"%>
<%
	String idcli = request.getParameter("idcli");
	String nome = request.getParameter("nome");
	String fone = request.getParameter("fone");
	String email = request.getParameter("email");
	String senha = request.getParameter("senha");
	String create = "insert into tb_cliente(idcli,nome,fone,email,senha) values ('"+idcli+"','"+nome+"','"+fone+"','"+email+"','"+senha+"')";

	try{
		//abrindo a conexão
		conexao.createStatement().executeUpdate(create);
		conexao.setAutoCommit(true);
		//direcionando ao index (comando que te leva aonde tu quer ir)
		response.sendRedirect("administrador.jsp");
	}catch(Exception e){
		e.printStackTrace();
		conexao.close();
	}
	
%>