<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="utf-8">
    <title>Agencia App</title>
</head>

<body>
    <!-- A grey horizontal navbar that becomes vertical on small screens -->
    <div class="conteiner  bg-light">
        <%@ include file="../components/nav.jsp" %>
        <div class="container">
            <h2>Agencia app</h2>
            <p>Projeto para cadastrar profissionais de saude em agencia</p>

            <h3>Classe: Profissional</h3>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Matricula</th>
                        <th>Especialidades</th>
                        <th>CREFITO</th>
                        <th>Atende em casa?</th>
                        <th>excluir</th>
                    </tr>
                </thead>
                <tbody>
                    <tbody>
                        <c:forEach var="i" items="${listagem}">
                            <tr>
                                <td>${i.id}</td>
                                <td>${i.nome}</td>
                                <td>${i.matricula}</td>
                                <td>${i.especialidades}</td>
                                <td>${i.getConselhoRegional()}</td>
                                <td>${i.atendeEmCasa}</td>
                                <td><a href="/fisioterapeuta/${i.id}/excluir">excluir</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </tbody>
        </div>
    </div>
</body>

</html>