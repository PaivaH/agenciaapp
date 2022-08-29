package br.edu.infnet.agenciaapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.domain.Fisioterapeuta;

@Controller
public class FisioterapeutaController {
    public static Map<Integer, Fisioterapeuta> fisioterapeutas = new HashMap<Integer, Fisioterapeuta>();
    public static int id = 0;

    public static void addFisioterapeuta(Fisioterapeuta fisioterapeuta) {
        fisioterapeuta.setId(++id);
        fisioterapeutas.put(id, fisioterapeuta);
    }

    public static Collection<Fisioterapeuta> obterFisioterapeutas() {
        return fisioterapeutas.values();
    }

    public static void excluir(Integer id) {
        fisioterapeutas.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }

    @GetMapping(value = "/fisioterapeuta/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", obterFisioterapeutas());

        return "/fisioterapeuta/lista";
    }
    
    @GetMapping(value = "/fisioterapeuta/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);

        return "redirect:/fisioterapeuta/lista";
    }
}
