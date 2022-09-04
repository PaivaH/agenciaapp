<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <c:if test="${not empty user}">
                <li class="nav-item">
                    <a class="nav-link" href="/usuario/lista">Usuarios</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/agencia/lista">Agencia</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/profissional/lista">Profissionais</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/psicologo/lista">Psicologo</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/nutricionista/lista">Nutricionista</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/fisioterapeuta/lista">Fisioterapeuta</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/responsavel/lista">Responsavel</a>
                </li>
            </c:if>
        </ul>
    </div>
    <ul class="navbar-nav navbar-right mr-2">
        <c:if test="${empty user}">
            <li class="nav-item">
                <a class="nav-link" href="/usuario/incluir">Signup</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Login</a>
            </li>
        </c:if>
        <c:if test="${not empty user}">
            <li class="nav-item">
                <a class="nav-link" href="/logout">Logout ${user}</a>
            </li>
        </c:if>
    </ul>
</nav>