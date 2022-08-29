package br.edu.infnet.agenciaapp.model.domain;

import java.util.List;

import br.edu.infnet.agenciaapp.model.exception.agencia.cnpjEmptyException;
import br.edu.infnet.agenciaapp.model.exception.agencia.cnpjNullException;
import br.edu.infnet.agenciaapp.model.interfaces.IPrinter;

public class Agencia implements IPrinter {
    private Integer id;
    private String nome;
    private String cnpj;
    private String endereco;
    private List<Profissional> profissionais;
    private Responsavel responsavel;

    public Agencia() {
    }

    public Agencia(String nome, String cnpj, String endereco, List<Profissional> profissionais,
            Responsavel responsavel) throws cnpjEmptyException, cnpjNullException {

        if (cnpj == null) {
            throw new cnpjNullException("CNPJ não pode ser nulo");
        }
        if (cnpj.isEmpty()) {
            throw new cnpjEmptyException("CNPJ não pode estar vazio");
        }
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.profissionais = profissionais;
        this.responsavel = responsavel;
    }

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

    public List<Profissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Responsavel getresponsavel() {
        return responsavel;
    }

    public void setresponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return nome + ";" + cnpj + ";" + endereco + ";" + responsavel;
    }

    @Override
    public void impressao() {
        System.out.println(this);

    }
}
