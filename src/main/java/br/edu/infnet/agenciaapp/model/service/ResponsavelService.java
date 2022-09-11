package br.edu.infnet.agenciaapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Responsavel;

@Service
public class ResponsavelService {
    public static Map<Integer, Responsavel> responsaveis = new HashMap<Integer, Responsavel>();
    public static Integer id = 0;

    public void addResponsavel(Responsavel responsavel) {
        responsavel.setId(++id);
        responsaveis.put(id, responsavel);
    }

    public Collection<Responsavel> obterProfissionals() {
        return responsaveis.values();
    }

    public void excluir(Integer id) {
        responsaveis.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }
}
