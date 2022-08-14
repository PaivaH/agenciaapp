package br.edu.infnet.agenciaapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.AppPrinter;
import br.edu.infnet.agenciaapp.model.domain.Agencia;

@Component
@Order(2)
public class AgenciaTest implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Agencia ag1 = new Agencia();
        ag1.setNome("Agencia 1");
        ag1.setCnpj("12346789");
        ag1.setEndereco("Rua A, 235, Centro");
        AppPrinter.imprimir("#Agencia 1", ag1);

        Agencia ag2 = new Agencia();
        ag2.setNome("Agencia 2");
        ag2.setCnpj("12346789");
        ag2.setEndereco("Rua A, 235, Centro");
        AppPrinter.imprimir("#Agencia 2", ag2);

        Agencia ag3 = new Agencia();
        ag3.setNome("Agencia 3");
        ag3.setCnpj("12346789");
        ag3.setEndereco("Rua A, 235, Centro");
        AppPrinter.imprimir("#Agencia 3", ag3);
    }
    
}
