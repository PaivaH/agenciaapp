package br.edu.infnet.agenciaapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.domain.Profissional;

@Controller
public class ProfissionalController {
    public static Map<Integer, Profissional> profissionais= new HashMap<Integer, Profissional>();
    public static int id = 0;

    public static void addProfissional (Profissional profissional) {
        profissional.setId(++id);
        profissionais.put(id, profissional);
    }

    public static Collection<Profissional> obterProfissionals() {
        return profissionais.values();
    }

    public static void excluir(Integer id) {
        profissionais.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }

    @GetMapping(value = "/profissional/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", obterProfissionals());
        
        return "/profissional/lista";
    }

    @GetMapping(value = "/profissional/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);

        return "redirect:/profissional/lista";
    }
}
