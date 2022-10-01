package br.edu.infnet.agenciaapp.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.agenciaapp.model.domain.Clinica;

public interface ClinicaRepository extends CrudRepository<Clinica, Integer>{
    
}
