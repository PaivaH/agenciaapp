package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.agenciaapp.model.domain.Usuario;
import br.edu.infnet.agenciaapp.model.service.ProfissionalService;

@Controller
public class ProfissionalController {
    @Autowired
    private ProfissionalService profissionalService;

    @GetMapping(value = "/profissional/lista")
    public String telaHome(Model model, @SessionAttribute("user") Usuario usuario) {

        if(usuario.getAdmin()){
            model.addAttribute("listagem", profissionalService.obterProfissionais());
        } else {
            model.addAttribute("listagem", profissionalService.obterProfissionaisPorUsuario(usuario.getId()));
        }

        
        return "/profissional/lista";
    }

    /*@GetMapping(value = "/profissional/incluir")
    public String telaCadastro() {
        return "profissional/cadastro";
    }

    @PostMapping(value = "/profissional/incluir")
    public String inclusao(Profissional profissional) {
        System.out.println(profissional);
        profissionalService.addProfissional(profissional);

        return "redirect:/profissional/lista";
    }*/

    @GetMapping(value = "/profissional/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        profissionalService.excluir(id);

        return "redirect:/profissional/lista";
    }
}
