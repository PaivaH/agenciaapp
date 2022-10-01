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
            <h2>Cadastramento de nutricionista</h2>
            <form action="/nutricionista/incluir" method="post">
                <div class="form-group">
                    <label for="nome">Nome:</label>
                    <input type="text" class="form-control" id="nome" name="nome" 
                            placeholder="Entre com seu nome">
                </div>
                <div class="form-group">
                    <label for="especialidades">Especialidades:</label>
                    <input type="text" class="form-control" id="especialidades" name="especialidades" 
                            placeholder="Entre com suas especialidades">
                </div>
                <div class="form-group">
                    <label for="esportivo">Esportivo?</label>
                    <input type="checkbox" class="form-check-input" id="esportivo" name="esportivo">
                </div>
                <div class="form-group">
                    <label for="matricula">matricula:</label>
                    <input type="number" class="form-control" id="matricula" name="matricula" 
                            placeholder="Entre com sua matricula">
                </div>
                <div class="form-group">
                    <label for="regiaoCrn">Região CRN:</label>
                    <input type="text" class="form-control" id="regiaoCrn" name="regiaoCrn" 
                            placeholder="Região CRN">
                </div>
                <div class="form-group">
                    <label for="numeroCrn">Numero CRN:</label>
                    <input type="number" class="form-control" id="numeroCrn" name="numeroCrn" 
                            placeholder="Numero CRN">
                </div>
                <div class="form-group">
                    <label for="clinica">Clinica:</label>
                    <select class="form-control" id="clinica" name="clinica">
                        <c:forEach var="c" items="${clinicas}">
                            <option value="${c.id}">${c.nome}</option>
                        </c:forEach>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">Adicionar</button>
            </form>
        </div>
    </div>
</body>

</html>