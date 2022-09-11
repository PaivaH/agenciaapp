package br.edu.infnet.agenciaapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Profissional;

@Service
public class ProfissionalService {
    public static Map<Integer, Profissional> profissionais = new HashMap<Integer, Profissional>();
    public static int id = 0;

    public void addProfissional(Profissional profissional) {
        profissional.setId(++id);
        profissionais.put(id, profissional);
    }

    public Collection<Profissional> obterProfissionals() {
        return profissionais.values();
    }

    public void excluir(Integer id) {
        profissionais.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }
}
