package br.edu.infnet.bodybuilderapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.bodybuilderapp.model.domain.Agencia;

@Component
@Order(2)
public class AgenciaTest implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#Agencia 1");
        Agencia ag1 = new Agencia();
        ag1.setNome("Agencia 1");
        ag1.setCnpj("12346789");
        ag1.setEndereco("Rua A, 235, Centro");
        System.out.println(ag1);

        System.out.println("#Agencia 2");
        Agencia ag2 = new Agencia();
        ag2.setNome("Agencia 2");
        ag2.setCnpj("12346789");
        ag2.setEndereco("Rua A, 235, Centro");
        System.out.println(ag2);

        System.out.println("#Agencia 3");
        Agencia ag3 = new Agencia();
        ag3.setNome("Agencia 3");
        ag3.setCnpj("12346789");
        ag3.setEndereco("Rua A, 235, Centro");
        System.out.println(ag3);
    }
    
}
