package br.edu.infnet.agenciaapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.AppPrinter;
import br.edu.infnet.agenciaapp.model.domain.Psicologo;

@Component
@Order
public class PsicologoTest implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Psicologo ps1 = new Psicologo();
        ps1.setNome("Patricia");
        ps1.setEspecialidadaes("Infantil");
        ps1.setMatricula(1223);
        ps1.setRegiaoCrp("RJ2");
        ps1.setNumeroCrp("8792");
        ps1.getConselhoRegional();
        AppPrinter.imprimir("Psicologo", ps1);
    }
    
}
