<%//A linha abaixo importa o módulo de conexão  %>
<%@ include file="conecao.jsp"%>
<%

	String idcli = request.getParameter("idcli");
	String nome = request.getParameter("nome");
	String fone = request.getParameter("fone");
	String email = request.getParameter("email");
	String senha = request.getParameter("senha");
	String update = "update tb_cliente set nome='"+nome+"',fone='"+fone+"',email='"+email+"',senha='"+senha+"' where idcli='"+idcli+"'";

	
	try{
		
		//,fone='"+fone+"', email='"+email+"',senha='"+senha+"'
		//abrindo a conexão
		Statement st = conexao.createStatement();
		st.executeUpdate(update);
		conexao.setAutoCommit(true);
		//direcionando ao index (comando que te leva aonde tu quer ir)
		response.sendRedirect("read.jsp");
		conexao.close();
	}catch(Exception e){
		e.printStackTrace();
		conexao.close();
	}
	
%>