package br.edu.infnet.agenciaapp.model.domain;

public abstract class Profissional implements IPrinter{
    protected String nome;
    protected int matricula;
    protected String especialidadaes;

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

    public String getEspecialidadaes() {
        return especialidadaes;
    }

    public void setEspecialidadaes(String especialidadaes) {
        this.especialidadaes = especialidadaes;
    }

    @Override
    public String toString() {
        return "Profissional [especialidadaes=" + especialidadaes + ", matricula=" + matricula + ", nome=" + nome + "]";
    }
    
}
