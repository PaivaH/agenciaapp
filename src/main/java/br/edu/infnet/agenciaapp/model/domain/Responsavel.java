package br.edu.infnet.agenciaapp.model.domain;

import br.edu.infnet.agenciaapp.model.interfaces.IPrinter;

public class Responsavel implements IPrinter{
    private int id;
    private String nome;
    private String cargo;
    private String email;

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
    @Override
    public String toString() {
        return "Responsavel [cargo=" + cargo + ", email=" + email + ", nome=" + nome + "]";
    }
    
    @Override
    public void impressao() {
        System.out.println(this);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
