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
            <h3>Classe: Profissional</h3>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Profissional</th>
                        <th>Nome</th>
                        <th>Matricula</th>
                        <th>Especialidades</th>
                        <th>Links</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="i" items="${listagem}">
                        <tr>
                            <td>${i.id}</td>
                            <td>${i.getClass().getSimpleName()}</td>
                            <td>${i.nome}</td>
                            <td>${i.matricula}</td>
                            <td>${i.especialidades}</td>
                            <td><a href="/profissional/${i.id}/excluir">excluir</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <c:if test="${empty listagem}">
                <p>listagem vazia!!</p>
            </c:if>
        </div>
    </div>
</body>

</html>