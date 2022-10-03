<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="utf-8">
    <title>ClinicaApp</title>
</head>

<body>
    <!-- A grey horizontal navbar that becomes vertical on small screens -->
    <div class="conteiner  bg-light">
        <%@ include file="../components/nav.jsp" %>
        <div class="container">
            <h2>Clinicaapp</h2>
            <p>Projeto para cadastrar profissionais de saude em agencia</p>

            <h3>Classe: Profissional</h3>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Senha</th>
                        <th>excluir</th>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${not empty listagem}">
                        <c:forEach var="i" items="${listagem}">
                            <tr>
                                <td>${i.nome}</td>
                                <td>${i.email}</td>
                                <td>${i.senha}</td>
                                <td><a href="/usuario/${i.id}/excluir">excluir</a></td>
                            </tr>
                        </c:forEach>
                    </c:if>
                    <c:if test="${not empty usuarioLogado}">
                        <tr>
                            <td>${usuarioLogado.nome}</td>
                            <td>${usuarioLogado.email}</td>
                            <td>${usuarioLogado.senha}</td>
                            <td><a href="/usuario/${usuarioLogado.id}/excluir">excluir</a></td>
                        </tr>
                    </c:if>
                </tbody>
            </table>
        </div>
    </div>
</body>

</html>