<%@page import="model.Aluno"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
testando
              <%
              
              Usuario usu = (Usuario)session.getAttribute("usuario");
              
Aluno aluno = null;
if (usu.getPessoa() instanceof Aluno) {
	aluno = (Aluno) usu.getPessoa();

}              
              %>
              
              
              
              
<label for="inputDataProva"><%= aluno.getNome()%></label>              
</body>
</html>