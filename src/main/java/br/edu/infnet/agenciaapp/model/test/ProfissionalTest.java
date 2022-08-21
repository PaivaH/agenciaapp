package br.edu.infnet.agenciaapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.AppPrinter;
import br.edu.infnet.agenciaapp.controller.ProfissionalController;
import br.edu.infnet.agenciaapp.model.domain.Fisioterapeuta;
import br.edu.infnet.agenciaapp.model.domain.Nutricionista;
import br.edu.infnet.agenciaapp.model.domain.Profissional;
import br.edu.infnet.agenciaapp.model.domain.Psicologo;

@Component
@Order(3)
public class ProfissionalTest implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Profissional fisio1 = new Fisioterapeuta();
        fisio1.setNome("Rodrigo");
        fisio1.setMatricula(3658);
        fisio1.setEspecialidades("Reabilitação, Torcicolo, Lordose");
        AppPrinter.imprimir("Fisioterapeuta 1", fisio1);
        ProfissionalController.addProfissional(fisio1);

        Profissional nutri1 = new Nutricionista();
        nutri1.setNome("Cristina");
        nutri1.setMatricula(864);
        nutri1.setEspecialidades("Emagrecimento");
        AppPrinter.imprimir("Nutricionista 1", nutri1);
        ProfissionalController.addProfissional(nutri1);

        Profissional ps1 = new Psicologo();
        ps1.setNome("Patricia");
        ps1.setEspecialidades("Infantil");
        ps1.setMatricula(1223);
        ps1.getConselhoRegional();
        AppPrinter.imprimir("Psicologo", ps1);
        ProfissionalController.addProfissional(ps1);
    }
    
}
