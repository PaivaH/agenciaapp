package br.edu.infnet.agenciaapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.domain.Responsavel;

@Controller
public class ResponsavelController {
    public static Map<Integer, Responsavel> responsaveis = new HashMap<Integer, Responsavel>();
    public static Integer id = 0;

    public static void addResponsavel(Responsavel responsavel){
        responsavel.setId(++id);
        responsaveis.put(id, responsavel);
    }

    public static Collection<Responsavel> obterProfissionals() {
        return responsaveis.values();
    }

    public static void excluir(Integer id) {
        responsaveis.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }

    @GetMapping(value = "/responsavel/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", obterProfissionals());

        return "/responsavel/lista";
    }

    @GetMapping(value = "/responsavel/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);

        return "redirect:/responsavel/lista";
    }
}
