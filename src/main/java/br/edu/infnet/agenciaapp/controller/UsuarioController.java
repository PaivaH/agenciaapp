package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.agenciaapp.model.domain.Usuario;
import br.edu.infnet.agenciaapp.model.service.UsuarioService;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", usuarioService.obterUsuarios());

        return "/usuario/lista";
    }

    @GetMapping(value = "/usuario/incluir")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String inclusao(Usuario usuario) {
        System.out.println(usuario);
        usuarioService.incluir(usuario);

        return "redirect:/login";
    }

    @GetMapping(value = "/usuario/{email}/excluir")
    public String exclusao(@PathVariable String email) {
        usuarioService.excluir(email);

        return "redirect:/usuario/lista";
    }
}
