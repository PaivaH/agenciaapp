package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.agenciaapp.model.domain.Responsavel;
import br.edu.infnet.agenciaapp.model.domain.Usuario;
import br.edu.infnet.agenciaapp.model.service.ResponsavelService;

@Controller
public class ResponsavelController {
    @Autowired
    ResponsavelService responsavelService;

    @GetMapping(value = "/responsavel/lista")
    public String telaHome(Model model, @SessionAttribute("user") Usuario usuario) {

        if(usuario.getAdmin()){
            model.addAttribute("listagem", responsavelService.obterResponsaveis());
        } else {
            model.addAttribute("listagem", responsavelService.obterResponsaveisPorUsuario(usuario.getId()));
        }

        return "/responsavel/lista";
    }

    @GetMapping(value = "/responsavel/incluir")
    public String telaCadastro() {
        return "responsavel/cadastro";
    }

    @PostMapping(value = "/responsavel/incluir")
    public String inclusao(Responsavel responsavel, @SessionAttribute("user") Usuario usuario) {
        responsavel.setUsuario(usuario);
        responsavelService.addResponsavel(responsavel);

        return "redirect:/responsavel/lista";
    }

    @GetMapping(value = "/responsavel/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        responsavelService.excluir(id);

        return "redirect:/responsavel/lista";
    }
}
