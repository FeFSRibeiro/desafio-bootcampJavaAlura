<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Autores</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<h1 class="text-center"><b>Cadastro de Autores</b></h1>
<body class="container">
	<form action="<c:url value="/autores"/>" method="POST">
		<div class="form-group">
			<label for="nome"><b>Nome</b></label>
			<input id="nome" class="form-control" name="nome">
		</div>
		<div class="form-group">
			<label for="email"><b>E-mail</b></label>
			<input id="email" class="form-control" name="email">
		</div>
		<div class="form-group">
			<label for="dataNascimento"><b>Data Nascimento</b></label>
			<input id="dataNascimento" class="form-control" name="dataNascimento">
		</div>
		<div class="form-group">
			<label for="miniCurriculo"><b>Mini Currículo</b></label>
			<textarea id="miniCurriculo" class="form-control" name="miniCurriculo"></textarea>
		</div>
		<input type="submit" value="Cadastrar" class="mt-3 btn-primary">
	</form>
	<h2 class="text-center"><b>Lista de Autores</b></h2>
	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>NOME</th>
				<th>E-MAIL</th>
				<th>DATA NASCIMENTO</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${autores}" var="a">
				<tr>
					<td>${a.nome}</td>
					<td>${a.email}</td>
					<td>${a.dataNascimento}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>