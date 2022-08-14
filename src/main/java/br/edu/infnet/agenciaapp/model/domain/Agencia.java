package br.edu.infnet.agenciaapp.model.domain;

public class Agencia implements IPrinter{
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
    
} 
