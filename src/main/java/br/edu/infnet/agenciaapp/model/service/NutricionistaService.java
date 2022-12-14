package br.edu.infnet.agenciaapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Nutricionista;
import br.edu.infnet.agenciaapp.model.repository.NutricionistaRepository;

@Service
public class NutricionistaService {
    @Autowired
    NutricionistaRepository nutricionistaRepository;

    public void addNutricionista(Nutricionista nutricionista) {
        nutricionistaRepository.save(nutricionista);
    }

    public Iterable<Nutricionista> obterNutricionistas() {
        return nutricionistaRepository.findAll();
    }

    public Iterable<Nutricionista> obterNutricionistasPorUsuarios(Integer id) {
        return nutricionistaRepository.obterProfissionaisPorUsuario(id);
    }

    public void excluir(Integer id) {
        nutricionistaRepository.deleteById(id);
    }

}
