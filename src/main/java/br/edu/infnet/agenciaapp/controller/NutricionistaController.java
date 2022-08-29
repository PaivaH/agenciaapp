package br.edu.infnet.agenciaapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.domain.Nutricionista;

@Controller
public class NutricionistaController {
    public static Map<Integer, Nutricionista> nutricionistas= new HashMap<Integer, Nutricionista>();
    public static int id = 0;

    public static void addNutricionista (Nutricionista nutricionista) {
        nutricionista.setId(++id);
        nutricionistas.put(id, nutricionista);
    }

    public static Collection<Nutricionista> obterNutricionistas() {
        return nutricionistas.values();
    }

    public static void excluir(Integer id) {
        nutricionistas.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }

    @GetMapping(value = "/nutricionista/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", obterNutricionistas());

        return "/nutricionista/lista";
    }

    @GetMapping(value = "/nutricionista/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);

        return "redirect:/nutricionista/lista";
    }
}
