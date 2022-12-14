package br.edu.infnet.agenciaapp.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.agenciaapp.model.domain.Fisioterapeuta;

public interface FisioterapeutaRepository extends CrudRepository<Fisioterapeuta, Integer>{
    
    @Query("from Fisioterapeuta p where p.clinica.responsavel.usuario.id = :id")
    Iterable<Fisioterapeuta> obterProfissionaisPorUsuario(Integer id);
}
