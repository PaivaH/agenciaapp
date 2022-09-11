package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.service.FisioterapeutaService;

@Controller
public class FisioterapeutaController {
    @Autowired
    private FisioterapeutaService fisioterapeutaService;

    @GetMapping(value = "/fisioterapeuta/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", fisioterapeutaService.obterFisioterapeutas());

        return "/fisioterapeuta/lista";
    }
    
    @GetMapping(value = "/fisioterapeuta/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        fisioterapeutaService.excluir(id);

        return "redirect:/fisioterapeuta/lista";
    }
}
