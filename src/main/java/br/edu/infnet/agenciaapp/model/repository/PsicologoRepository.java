package br.edu.infnet.agenciaapp.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.agenciaapp.model.domain.Psicologo;

public interface PsicologoRepository extends CrudRepository <Psicologo, Integer>{
    
}
