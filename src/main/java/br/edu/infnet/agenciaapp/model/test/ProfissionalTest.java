package br.edu.infnet.agenciaapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProfissionalTest implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
    
}
