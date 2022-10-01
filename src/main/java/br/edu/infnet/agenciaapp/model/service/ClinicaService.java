package br.edu.infnet.agenciaapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Clinica;
import br.edu.infnet.agenciaapp.model.repository.ClinicaRepository;

@Service
public class ClinicaService {
    
    @Autowired
    ClinicaRepository clinicaRepository;

    public void addClinica(Clinica clinica){
        clinicaRepository.save(clinica);
    }

    public Iterable<Clinica> obterClinicas() {
        return clinicaRepository.findAll();
    }

    public void excluir(Integer id) {
        clinicaRepository.deleteById(id);
    }
}
