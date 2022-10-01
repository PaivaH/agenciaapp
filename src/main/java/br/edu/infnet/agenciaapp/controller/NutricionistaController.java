package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.agenciaapp.model.domain.Nutricionista;
import br.edu.infnet.agenciaapp.model.service.ClinicaService;
import br.edu.infnet.agenciaapp.model.service.NutricionistaService;

@Controller
public class NutricionistaController {
    @Autowired
    private NutricionistaService nutricionistaService;
    
    @Autowired
    private ClinicaService clinicaService;

    @GetMapping(value = "/nutricionista/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", nutricionistaService.obterNutricionistas());

        return "/nutricionista/lista";
    }

    @GetMapping(value = "/nutricionista/incluir")
    public String telaCadastro(Model model) {
        model.addAttribute("clinicas", clinicaService.obterClinicas());

        return "nutricionista/cadastro";
    }

    @PostMapping(value = "/nutricionista/incluir")
    public String inclusao(Nutricionista nutricionista) {
        System.out.println(nutricionista);
        nutricionistaService.addNutricionista(nutricionista);

        return "redirect:/nutricionista/lista";
    }

    @GetMapping(value = "/nutricionista/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        nutricionistaService.excluir(id);

        return "redirect:/nutricionista/lista";
    }
}
