package br.edu.infnet.agenciaapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Nutricionista;

@Service
public class NutricionistaService {
    public static Map<Integer, Nutricionista> nutricionistas = new HashMap<Integer, Nutricionista>();
    public static int id = 0;

    public void addNutricionista(Nutricionista nutricionista) {
        nutricionista.setId(++id);
        nutricionistas.put(id, nutricionista);
    }

    public Collection<Nutricionista> obterNutricionistas() {
        return nutricionistas.values();
    }

    public void excluir(Integer id) {
        nutricionistas.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }

}
