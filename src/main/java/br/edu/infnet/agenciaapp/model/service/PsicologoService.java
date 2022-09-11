package br.edu.infnet.agenciaapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Psicologo;

@Service
public class PsicologoService {
    public static Map<Integer, Psicologo> psicologos= new HashMap<Integer, Psicologo>();
    public static Integer id = 0;

    public  void addPsicologo (Psicologo psicologo) {
        psicologo.setId(++id);
        psicologos.put(id, psicologo);
    }

    public  Collection<Psicologo> obterPsicologos() {
        return psicologos.values();
    }

    public  void excluir(Integer id) {
        psicologos.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }
}
