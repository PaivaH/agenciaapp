package br.edu.infnet.agenciaapp.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.AppPrinter;
import br.edu.infnet.agenciaapp.model.domain.Psicologo;
import br.edu.infnet.agenciaapp.model.service.PsicologoService;

@Component
public class PsicologoTest implements ApplicationRunner {
    @Autowired
    PsicologoService psicologoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Psicologo ps1 = new Psicologo();
        ps1.setNome("Patricia Pilares");
        ps1.setTempoSessao(50);
        ps1.setEspecialidades("Infantil");
        ps1.setMatricula(1223);
        ps1.setRegiaoCrp("RJ2");
        ps1.setNumeroCrp("4792");
        ps1.setAtendeRemoto(true);
        ps1.getConselhoRegional();
        AppPrinter.imprimir("Psicologo", ps1);
        psicologoService.addPsicologo(ps1);

        Psicologo ps2 = new Psicologo();
        ps2.setNome("Dante Nogueira");
        ps2.setTempoSessao(55);
        ps2.setEspecialidades("Infantil");
        ps2.setMatricula(5151);
        ps2.setRegiaoCrp("RJ2");
        ps2.setNumeroCrp("4152");
        ps1.setAtendeRemoto(true);
        ps2.getConselhoRegional();
        AppPrinter.imprimir("Psicologo", ps2);
        psicologoService.addPsicologo(ps2);

        Psicologo ps3 = new Psicologo();
        ps3.setNome("Caio Gomes");
        ps3.setTempoSessao(50);
        ps3.setEspecialidades("Infantil");
        ps3.setMatricula(1223);
        ps3.setRegiaoCrp("RJ2");
        ps3.setNumeroCrp("4125");
        ps1.setAtendeRemoto(false);
        ps3.getConselhoRegional();
        AppPrinter.imprimir("Psicologo", ps3);
        psicologoService.addPsicologo(ps3);
    }

}
