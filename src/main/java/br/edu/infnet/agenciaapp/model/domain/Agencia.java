package br.edu.infnet.agenciaapp.model.domain;

import java.util.List;

import br.edu.infnet.agenciaapp.model.interfaces.IPrinter;

public class Agencia implements IPrinter{
    private int id;
    private String nome;
    private String cnpj;
    private String endereco;
    private List <Profissional> profissionais;
    private List <Responsavel> responsaveis;

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

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Agencia [cnpj=" + cnpj + ", endereco=" + endereco + ", nome=" + nome + "]";
    }

    @Override
    public void impressao() {
        System.out.println(this);
        
    }
    public List<Profissional> getProfissionais() {
        return profissionais;
    }
    public void setProfissionais(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }
    public List<Responsavel> getResponsaveis() {
        return responsaveis;
    }
    public void setResponsaveis(List<Responsavel> responsaveis) {
        this.responsaveis = responsaveis;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
} 
