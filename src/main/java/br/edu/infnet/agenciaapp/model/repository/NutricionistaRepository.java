package br.edu.infnet.agenciaapp.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.agenciaapp.model.domain.Nutricionista;

public interface NutricionistaRepository extends CrudRepository<Nutricionista, Integer> {

    @Query("from Nutricionista p where p.clinica.responsavel.usuario.id = :id")
    Iterable<Nutricionista> obterProfissionaisPorUsuario(Integer id);
}
