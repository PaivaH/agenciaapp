package br.edu.infnet.agenciaapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Responsavel;
import br.edu.infnet.agenciaapp.model.repository.ResponsavelRepository;

@Service
public class ResponsavelService {

    @Autowired
    ResponsavelRepository responsavelRepositoy;

    public void addResponsavel(Responsavel responsavel) {
        responsavelRepositoy.save(responsavel);
    }

    public Responsavel obterResponsavelById(Integer id){
        return responsavelRepositoy.findById(id).get();
    }

    public Iterable<Responsavel> obterResponsaveis() {
        return responsavelRepositoy.findAll();
    }

    public void excluir(Integer id) {
        responsavelRepositoy.deleteById(id);
    }
}
