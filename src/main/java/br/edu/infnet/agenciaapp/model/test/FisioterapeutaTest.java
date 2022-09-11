package br.edu.infnet.agenciaapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.AppPrinter;
import br.edu.infnet.agenciaapp.model.domain.Fisioterapeuta;
import br.edu.infnet.agenciaapp.model.service.FisioterapeutaService;

@Component
public class FisioterapeutaTest implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Fisioterapeuta fisio1 = new Fisioterapeuta();
        fisio1.setNome("Rodrigo Siqueira");
        fisio1.setMatricula(3658);
        fisio1.setRegiaoCrefito("RJ 6");
        fisio1.setNumeroCrefito("96325");
        fisio1.setEspecialidades("Reabilitação, Torcicolo, Lordose");
        fisio1.setAtendeEmCasa(false);
        AppPrinter.imprimir("Fisioterapeuta 1", fisio1);
        new FisioterapeutaService().addFisioterapeuta(fisio1);

        Fisioterapeuta fisio2 = new Fisioterapeuta();
        fisio2.setNome("Pablo Silva");
        fisio2.setMatricula(3660);
        fisio2.setRegiaoCrefito("RJ 6");
        fisio2.setNumeroCrefito("96347");
        fisio2.setEspecialidades("Reabilitação, Torcicolo");
        fisio2.setAtendeEmCasa(true);
        AppPrinter.imprimir("Fisioterapeuta 2", fisio2);
        new FisioterapeutaService().addFisioterapeuta(fisio2);

        Fisioterapeuta fisio3 = new Fisioterapeuta();
        fisio3.setNome("Ricardo Amaro");
        fisio3.setMatricula(3675);
        fisio3.setRegiaoCrefito("RJ 6");
        fisio3.setNumeroCrefito("96418");
        fisio3.setEspecialidades("Torcicolp");
        fisio3.setAtendeEmCasa(true);
        AppPrinter.imprimir("Fisioterapeuta 3", fisio3);
        new FisioterapeutaService().addFisioterapeuta(fisio3);
    }
    
}
