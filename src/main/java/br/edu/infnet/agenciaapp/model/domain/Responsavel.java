package br.edu.infnet.agenciaapp.model.domain;

import java.util.List;

import br.edu.infnet.agenciaapp.model.exception.responsavel.nameEmptyException;
import br.edu.infnet.agenciaapp.model.exception.responsavel.nameNullException;
import br.edu.infnet.agenciaapp.model.interfaces.IPrinter;

public class Responsavel implements IPrinter {
    private Integer id;
    private String nome;
    private String cargo;
    private String email;
    private List<Agencia> agencias;

    public Responsavel() {
    }

    public Responsavel(String nome, String cargo, String email, List<Agencia> agencias)
            throws nameNullException, nameEmptyException {
        if (nome == null) {
            throw new nameNullException("Nome não pode ser nulo!");
        }
        if (nome.isBlank()) {
            throw new nameEmptyException("Nome não pode estar em branco!");
        }
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.agencias = agencias;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome  + ";" + cargo + ";" + email + ";" + agencias;
    }

    @Override
    public void impressao() {
        System.out.println(this);
    }
}
