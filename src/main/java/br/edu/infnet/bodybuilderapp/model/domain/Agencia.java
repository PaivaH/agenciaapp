package br.edu.infnet.bodybuilderapp.model.domain;

public class Agencia{
    private String nome;
    private String cnpj;
    private String endereco;
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private Profissional profissional;
    private String especialidades;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Profissional getProfissional() {
        return profissional;
    }
    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
    public String getEspecialidade() {
        return especialidades;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidades = especialidade;
    }

    @Override
    public String toString() {
        return "Agencia [especialidade=" + especialidades + ", nome=" + nome + ", profissional=" + profissional + "]";
    }
    
} 
