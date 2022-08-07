package br.edu.infnet.bodybuilderapp.model.domain;

public class Profissional {
    protected String nome;
    protected String conselhoProfissional;
    protected int matricula;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getConselhoProfissional() {
        return conselhoProfissional;
    }
    public void setConselhoProfissional(String conselhoProfissional) {
        this.conselhoProfissional = conselhoProfissional;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Profissional [conselhoProfissional=" + conselhoProfissional + ", matricula=" + matricula + ", nome="
                + nome + "]";
    }
}
