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
            <form action="/fisioterapeuta/incluir" method="post">
                <div class="form-group">
                    <label for="nome">Nome:</label>
                    <input type="text" class="form-control" id="nome" name="nome" 
                            placeholder="Entre com seu nome">
                </div>
                <div class="form-group">
                    <label for="matricula">matricula:</label>
                    <input type="number" class="form-control" id="matricula" name="matricula" 
                            placeholder="Entre com sua matricula">
                </div>
                <div class="form-group">
                    <label for="especialidades">Especialidades:</label>
                    <input type="text" class="form-control" id="especialidades" name="especialidades" 
                            placeholder="Entre com suas especialidades">
                </div>
                <div class="form-group">
                    <label for="atendeEmCasa">Atende em casa?</label>
                    <input type="checkbox" class="form-check-input" id="atendeEmCasa" name="atendeEmCasa">
                </div>
                <div class="form-group">
                    <label for="regiaoCrefito">Região Crefito:</label>
                    <input type="text" class="form-control" id="regiaoCrefito" name="regiaoCrefito" 
                            placeholder="Região Crefito">
                </div>
                <div class="form-group">
                    <label for="numeroCrefito">Numero Crefito:</label>
                    <input type="number" class="form-control" id="numeroCrefito" name="numeroCrefito" 
                            placeholder="Numero Crefito">
                </div>
                <button type="submit" class="btn btn-primary">Adicionar</button>
            </form>
        </div>
    </div>
</body>

</html>