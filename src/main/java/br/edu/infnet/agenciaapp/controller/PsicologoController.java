package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.agenciaapp.model.domain.Psicologo;
import br.edu.infnet.agenciaapp.model.service.PsicologoService;

@Controller
public class PsicologoController {
    @Autowired
    private PsicologoService psicologoService;
    
    @GetMapping(value = "/psicologo/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", psicologoService.obterPsicologos());

        return "/psicologo/lista";
    }

    @GetMapping(value = "/psicologo/incluir")
    public String telaCadastro() {
        return "psicologo/cadastro";
    }

    @PostMapping(value = "/psicologo/incluir")
    public String inclusao(Psicologo psicologo) {
        System.out.println(psicologo);
        psicologoService.addPsicologo(psicologo);

        return "redirect:/psicologo/lista";
    }

    @GetMapping(value = "/psicologo/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        psicologoService.excluir(id);

        return "redirect:/psicologo/lista";
    }
}
