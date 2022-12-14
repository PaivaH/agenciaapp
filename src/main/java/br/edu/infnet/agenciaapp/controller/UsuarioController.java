package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.agenciaapp.model.domain.Usuario;
import br.edu.infnet.agenciaapp.model.service.UsuarioService;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario/lista")
    public String telaHome(Model model, @SessionAttribute("user") Usuario usuario) {
        if (usuario.getAdmin()) {
            model.addAttribute("listagem", usuarioService.obterUsuarios());
        } else {
            model.addAttribute("usuarioLogado", usuarioService.obterUsuario(usuario.getId()));
        }

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

    @GetMapping(value = "/usuario/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        usuarioService.excluir(id);

        return "redirect:/usuario/lista";
    }
}
