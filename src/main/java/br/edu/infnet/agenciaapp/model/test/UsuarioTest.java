package br.edu.infnet.agenciaapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.model.domain.Usuario;
import br.edu.infnet.agenciaapp.model.service.UsuarioService;

@Component
public class UsuarioTest implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNome("Admin");
        usuario.setEmail("admin@admin.com");
        usuario.setSenha("123");

        new UsuarioService().incluir(usuario);
    }
    
}
