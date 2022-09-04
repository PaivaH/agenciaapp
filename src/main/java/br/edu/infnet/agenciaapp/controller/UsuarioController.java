package br.edu.infnet.agenciaapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.agenciaapp.model.domain.Usuario;

@Controller
public class UsuarioController {
    public static Map<String, Usuario> usuarios = new HashMap<String, Usuario>();

    public static void incluir(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }

    public static Usuario validar(String email, String senha) {
        Usuario usuario = usuarios.get(email);

        if (senha != null && senha.equals(usuario.getSenha())) {
            return usuario;
        }

        return null;
    }

    public static Collection<Usuario> obterUsuarios() {
        return usuarios.values();
    }

    public static void excluir(String email) {
        usuarios.remove(email);
        System.out.println(email + " Excluido com sucesso");
    }

    @GetMapping(value = "/usuario/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", obterUsuarios());

        return "/usuario/lista";
    }

    @GetMapping(value = "/usuario/incluir")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String inclusao(Usuario usuario) {
        System.out.println(usuario);
        incluir(usuario);

        return "redirect:/login";
    }

    @GetMapping(value = "/usuario/{email}/excluir")
    public String exclusao(@PathVariable String email) {
        excluir(email);

        return "redirect:/usuario/lista";
    }
}
