package br.edu.infnet.agenciaapp.model.test;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.model.domain.Usuario;
import br.edu.infnet.agenciaapp.model.service.UsuarioService;

@Component
@Order()
public class Test implements ApplicationRunner {
    private Usuario usuario;

    @Autowired
    UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            FileReader fr = new FileReader("src/main/resources/static/usuario.txt");
            BufferedReader leitura = new BufferedReader(fr);

            String linha = leitura.readLine();
            while (linha != null) {
                String[] campos = linha.split(";");

                usuario = new Usuario();

                usuario.setNome(campos[0]);
                usuario.setEmail(campos[1]);
                usuario.setSenha(campos[2]);

                usuarioService.incluir(usuario);

                linha = leitura.readLine();
            }
            leitura.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }

}
