<%@ include file="conecao.jsp"%>
<%
String email = request.getParameter("email");
String senha = request.getParameter("senha");

try{
	Statement st = conexao.createStatement();
	String read = "select * from tb_cliente where email='"+email+"' and senha='"+senha+"'";	
	//executar o comando sql
	ResultSet rs = st.executeQuery(read);
	//tr�s clases conexion > conexao, resultset  e preparete statment _fazem parte do java sql *_
	//se existir user ou senha
	if(rs.next()){
		//rs tr�s o banco de dados, se existir var correspondente , rs tr�s o banco e leva para frente
		//armazenar na vari�vel o perfil
		String perfil = rs.getString(4);
		//tratamento do perfil
		if(perfil.equals("admin@admin.com")){
			response.sendRedirect("administrador.jsp");
			conexao.close();
		}else{
			response.sendRedirect("usuario.jsp");
			conexao.close();
		}
		
	}else{
		conexao.close();
		out.print("Usu�rio e/ou senha inv�lido(s).");
	}
		
}catch(Exception e){
	e.printStackTrace();
	conexao.close();
}

%>