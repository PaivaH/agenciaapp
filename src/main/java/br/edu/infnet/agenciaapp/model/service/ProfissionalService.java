package br.edu.infnet.agenciaapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Profissional;
import br.edu.infnet.agenciaapp.model.repository.ProfissionalRepository;

@Service
public class ProfissionalService {
    @Autowired
    ProfissionalRepository profissionalRepository;

    public void addProfissional(Profissional profissional) {
        profissionalRepository.save(profissional);
    }

    public Iterable<Profissional> obterProfissionals() {
        return profissionalRepository.findAll();
    }

    public void excluir(Integer id) {
        profissionalRepository.deleteById(id);
    }
}
