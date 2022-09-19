<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="utf-8">
    <title>Login</title>
</head>

<body>
    <!-- A grey horizontal navbar that becomes vertical on small screens -->
    <div class="conteiner bg-light">
        <%@ include file="../components/nav.jsp" %>
        <div class="container">
            <h2>Cadastramento de usuarios</h2>
            <form action="/clinica/incluir" method="post">
                <div class="form-group">
                    <label for="nome">Nome:</label>
                    <input type="text" class="form-control" id="nome" name="nome" 
                            placeholder="Entre com seu nome">
                </div>
                <div class="form-group">
                    <label for="cnpj">cnpj:</label>
                    <input type="text" class="form-control" id="cnpj" name="cnpj" 
                            placeholder="Entre com seu cnpj">
                </div>
                <div class="form-group">
                    <label for="endereco">endereco:</label>
                    <input type="text" class="form-control" id="endereco" name="endereco" 
                            placeholder="Entre com seu endereco">
                </div>
                <button type="submit" class="btn btn-primary">Adicionar</button>
            </form>
        </div>
    </div>
</body>

</html>