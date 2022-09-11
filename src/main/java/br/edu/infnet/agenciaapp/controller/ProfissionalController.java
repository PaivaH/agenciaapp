package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.service.ProfissionalService;

@Controller
public class ProfissionalController {
    @Autowired
    private ProfissionalService profissionalService;

    @GetMapping(value = "/profissional/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", profissionalService.obterProfissionals());
        
        return "/profissional/lista";
    }

    @GetMapping(value = "/profissional/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        profissionalService.excluir(id);

        return "redirect:/profissional/lista";
    }
}
