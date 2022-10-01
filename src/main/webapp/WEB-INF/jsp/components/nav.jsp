<nav class="navbar d-flex navbar-expand-lg navbar-dark bg-dark">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <c:if test="${not empty user}">
                <li class="nav-item">
                    <a class="nav-link" href="/usuario/lista">Usuarios</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/clinica/lista">Clinicas</a>
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
    <div class="ml-auto p-2">
        <ul class="navbar-nav navbar-right">
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
                    <a class="nav-link" href="/logout">Logout, ${user.nome}</a>
                </li>
            </c:if>
        </ul>
    </div>
</nav>