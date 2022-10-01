package br.edu.infnet.agenciaapp.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.agenciaapp.model.domain.Profissional;

public interface ProfissionalRepository extends CrudRepository<Profissional, Integer>{
    
}
