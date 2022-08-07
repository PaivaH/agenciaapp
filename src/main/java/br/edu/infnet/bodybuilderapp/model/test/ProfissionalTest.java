package br.edu.infnet.bodybuilderapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.bodybuilderapp.model.domain.Profissional;

@Component
@Order(3)
public class ProfissionalTest implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#Profissional 1");
        Profissional pr1 = new Profissional();
        pr1.setNome("Jose");
        pr1.setConselhoProfissional("CRP123456");
        pr1.setMatricula(123789456);
        System.out.println(pr1);

        System.out.println("#Profissional 2");
        Profissional pr2 = new Profissional();
        pr2.setNome("Jose");
        pr2.setConselhoProfissional("CRP123456");
        pr2.setMatricula(123789456);
        System.out.println(pr2);

        System.out.println("#Profissional 3");
        Profissional pr3 = new Profissional();
        pr3.setNome("Jose");
        pr3.setConselhoProfissional("CRP123456");
        pr3.setMatricula(123789456);
        System.out.println(pr3);
    }
    
}
