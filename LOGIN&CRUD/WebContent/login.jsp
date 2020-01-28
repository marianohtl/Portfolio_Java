<%@ include file="conecao.jsp"%>
<%
String email = request.getParameter("email");
String senha = request.getParameter("senha");

try{
	Statement st = conexao.createStatement();
	String read = "select * from tb_cliente where email='"+email+"' and senha='"+senha+"'";	
	//executar o comando sql
	ResultSet rs = st.executeQuery(read);
	//três clases conexion > conexao, resultset  e preparete statment _fazem parte do java sql *_
	//se existir user ou senha
	if(rs.next()){
		//rs trás o banco de dados, se existir var correspondente , rs trás o banco e leva para frente
		//armazenar na variável o perfil
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
		out.print("Usuário e/ou senha inválido(s).");
	}
		
}catch(Exception e){
	e.printStackTrace();
	conexao.close();
}

%>