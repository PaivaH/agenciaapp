package br.edu.infnet.agenciaapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Psicologo;
import br.edu.infnet.agenciaapp.model.repository.PsicologoRepository;

@Service
public class PsicologoService {
    @Autowired
    PsicologoRepository psicologoRepository;

    public  void addPsicologo (Psicologo psicologo) {
        psicologoRepository.save(psicologo);
    }

    public  Iterable<Psicologo> obterPsicologos() {
        return psicologoRepository.findAll();
    }

    public  void excluir(Integer id) {
        psicologoRepository.deleteById(id);
    }
}
