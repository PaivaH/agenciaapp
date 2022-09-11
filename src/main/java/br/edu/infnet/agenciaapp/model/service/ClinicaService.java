package br.edu.infnet.agenciaapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Clinica;

@Service
public class ClinicaService {
    public static Map<Integer, Clinica> clinicas = new HashMap<Integer, Clinica>();
    public static Integer id = 0;

    public void addClinica(Clinica clinica){
        clinica.setId(++id);
        clinicas.put(id, clinica);
    }

    public Collection<Clinica> obterClinicas() {
        return clinicas.values();
    }

    public void excluir(Integer id) {
        clinicas.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }
}
