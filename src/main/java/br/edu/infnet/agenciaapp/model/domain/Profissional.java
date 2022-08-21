package br.edu.infnet.agenciaapp.model.domain;

import br.edu.infnet.agenciaapp.model.interfaces.IPrinter;

public abstract class Profissional implements IPrinter{
    private int id;
    protected String nome;
    protected int matricula;
    protected String especialidades;

    public abstract String getConselhoRegional();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return "Profissional [especialidadaes=" + especialidades + ", matricula=" + matricula + ", nome=" + nome + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
