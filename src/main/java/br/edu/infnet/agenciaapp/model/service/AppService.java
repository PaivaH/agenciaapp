package br.edu.infnet.agenciaapp.model.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.app.Projeto;

@Service
public class AppService {
    private Projeto projeto;

    public void incluir(Projeto projeto) {
        this.projeto = projeto;
    }

    public Projeto obterProjeto() {
        return projeto;
    }
}
