package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.service.NutricionistaService;

@Controller
public class NutricionistaController {
    @Autowired
    private NutricionistaService nutricionistaService;

    @GetMapping(value = "/nutricionista/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", nutricionistaService.obterNutricionistas());

        return "/nutricionista/lista";
    }

    @GetMapping(value = "/nutricionista/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        nutricionistaService.excluir(id);

        return "redirect:/nutricionista/lista";
    }
}
