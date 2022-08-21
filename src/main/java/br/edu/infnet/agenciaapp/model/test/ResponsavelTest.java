package br.edu.infnet.agenciaapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.AppPrinter;
import br.edu.infnet.agenciaapp.controller.ResponsavelController;
import br.edu.infnet.agenciaapp.model.domain.Responsavel;

@Component
@Order(1)
public class ResponsavelTest implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Responsavel r1 = new Responsavel();
        r1.setCargo("Desenvolvedor");
        r1.setEmail("dev@gmail.com");
        r1.setNome("Thiago");
        AppPrinter.imprimir("#Responsavel 1", r1);
        ResponsavelController.addResponsavel(r1);

        Responsavel r2 = new Responsavel();
        r2.setCargo("Gerente");
        r2.setEmail("gerente@gmail.com");
        r2.setNome("Pedro");
        AppPrinter.imprimir("#Responsavel 2", r2);
        ResponsavelController.addResponsavel(r2);


        Responsavel r3 = new Responsavel();
        r3.setCargo("Proprietario");
        r3.setEmail("andrew@agencia.com");
        r3.setNome("Andre");
        AppPrinter.imprimir("##Responsavel 3", r3);
        ResponsavelController.addResponsavel(r3);

    }
    
}
