package br.edu.infnet.agenciaapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.agenciaapp.model.domain.Usuario;

@Service
public class UsuarioService {
    public static Map<String, Usuario> usuarios = new HashMap<String, Usuario>();

    public void incluir(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }

    public Usuario validar(String email, String senha) {
        Usuario usuario = usuarios.get(email);

        if (senha != null && senha.equals(usuario.getSenha())) {
            return usuario;
        }

        return null;
    }

    public Collection<Usuario> obterUsuarios() {
        return usuarios.values();
    }

    public void excluir(String email) {
        usuarios.remove(email);
        System.out.println(email + " Excluido com sucesso");
    }
}
