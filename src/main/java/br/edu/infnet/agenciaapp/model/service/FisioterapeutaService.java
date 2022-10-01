package br.edu.infnet.agenciaapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Fisioterapeuta;
import br.edu.infnet.agenciaapp.model.repository.FisioterapeutaRepository;

@Service
public class FisioterapeutaService {
    @Autowired
    FisioterapeutaRepository fisioterapeutaRepository;

    public void addFisioterapeuta(Fisioterapeuta fisioterapeuta) {
        fisioterapeutaRepository.save(fisioterapeuta);
    }

    public Iterable<Fisioterapeuta> obterFisioterapeutas() {
        return fisioterapeutaRepository.findAll();
    }

    public void excluir(Integer id) {
        fisioterapeutaRepository.deleteById(id);
    }
}
