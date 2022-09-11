package br.edu.infnet.agenciaapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Fisioterapeuta;

@Service
public class FisioterapeutaService {
    public static Map<Integer, Fisioterapeuta> fisioterapeutas = new HashMap<Integer, Fisioterapeuta>();
    public static int id = 0;

    public void addFisioterapeuta(Fisioterapeuta fisioterapeuta) {
        fisioterapeuta.setId(++id);
        fisioterapeutas.put(id, fisioterapeuta);
    }

    public Collection<Fisioterapeuta> obterFisioterapeutas() {
        return fisioterapeutas.values();
    }

    public void excluir(Integer id) {
        fisioterapeutas.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }
}
