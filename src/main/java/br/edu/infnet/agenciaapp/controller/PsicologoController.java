package br.edu.infnet.agenciaapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.domain.Psicologo;

@Controller
public class PsicologoController {
    public static Map<Integer, Psicologo> psicologos= new HashMap<Integer, Psicologo>();
    public static int id = 1;

    public static void addPsicologo (Psicologo psicologo) {
        psicologo.setId(id++);
        psicologos.put(id, psicologo);
    }

    public static Collection<Psicologo> obterPsicologos() {
        return psicologos.values();
    }

    public static void excluir(Integer id) {
        psicologos.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }
    
    @GetMapping(value = "/psicologo/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", obterPsicologos());

        return "/psicologo/lista";
    }

    @GetMapping(value = "/psicologo/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);

        System.out.println(id + " Excluido com sucesso");

        return "redirect:/psicologo/lista";
    }
}
