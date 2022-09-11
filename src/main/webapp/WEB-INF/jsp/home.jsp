<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="utf-8">
    <title>ClinicaApp</title>
</head>

<body>
    <div class="conteiner bg-light">
        <%@ include file="./components/nav.jsp" %>
        <div class="container">
            <h2>${projeto.nome}</h2>
            <p>${projeto.descricao}</p>

            <c:forEach var="c" items="${projeto.classes}">
                <h3>Classe: ${c.nome}</h3>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Atributo</th>
                            <th>Tipo</th>
                            <th>Descricao</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="a" items="${c.atributos}">
                            <tr>
                                <td>${a.nome}</td>
                                <td>${a.tipo}</td>
                                <td>${a.descricao}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:forEach>
        </div>
    </div>
</body>

</html>