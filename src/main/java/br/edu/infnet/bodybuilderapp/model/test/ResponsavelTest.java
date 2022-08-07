package br.edu.infnet.bodybuilderapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.bodybuilderapp.model.domain.Responsavel;

@Component
@Order(1)
public class ResponsavelTest implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#Responsavel 1");
        Responsavel r1 = new Responsavel();
        r1.setCargo("Desenvolvedor");
        r1.setEmail("dev@gmail.com");
        r1.setNome("Thiago");
        System.out.println(r1);

        System.out.println("#Responsavel 2");
        Responsavel r2 = new Responsavel();
        r2.setCargo("Desenvolvedor");
        r2.setEmail("dev@gmail.com");
        r2.setNome("Thiago");
        System.out.println(r2);

        System.out.println("#Responsavel 3");
        Responsavel r3 = new Responsavel();
        r3.setCargo("Desenvolvedor");
        r3.setEmail("dev@gmail.com");
        r3.setNome("Thiago");
        System.out.println(r3);
    }
    
}
