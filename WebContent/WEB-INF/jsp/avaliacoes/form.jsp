<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Avaliações</title>
</head>
<body>
	<h1>Cadastro de Avaliação</h1>
	<br><br>
	<form action="create" method="post">
		Descrição:<br>
		<input type="text" name="avaliacao.descricao"/><br>	
		Ano:<br>
		<input type="text" name="avaliacao.ano"/>		
		<br><br>
		<input type="submit" value="Salvar" />	
	</form>
</body>
</html>