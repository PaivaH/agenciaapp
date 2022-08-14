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
    <div class="conteiner">
        <nav class="navbar navbar-expand-sm bg-warning">

            <div class="container-fluid">
                <!-- Links -->
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/agencia">Agencia</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/profissional">Profissionais</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/psicologo">Psicologo</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/nutricionista">Nutricionista</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/fisioterapeuta">Fisioterapeuta</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/responsavel">Responsavel</a>
                    </li>
                </ul>
            </div>

        </nav>

        <div class="container mt-1 bg-light">
            <h2>Agencia app</h2>
            <p>Projeto para cadastrar profissionais de saude em agencia</p>

            <h3>Classe: Profissional</h3>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Atributo</th>
                        <th>Tipo</th>
                        <th>Descricao</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>nome</td>
                        <td>String</td>
                        <td>Nome do profissional</td>
                    </tr>
                    <tr>
                        <td>matricula</td>
                        <td>LocalDateTime</td>
                        <td>matricula do profissional na agencias</td>
                    </tr>
                    <tr>
                        <td>especialidadaes</td>
                        <td>String</td>
                        <td>especialidadaes que os profissionais atendem</td>
                    </tr>
                </tbody>
            </table>

            <h3>Classe: Responsavel</h3>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Atributo</th>
                        <th>Tipo</th>
                        <th>Descrição</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>nome</td>
                        <td>String</td>
                        <td>Nome do responsavel</td>
                    </tr>
                    <tr>
                        <td>cargo</td>
                        <td>String</td>
                        <td>Cargo que o responsavel ocupa</td>
                    </tr>
                    <tr>
                        <td>email</td>
                        <td>String</td>
                        <td>Email do responsavel</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</body>

</html>