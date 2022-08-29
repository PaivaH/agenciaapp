package br.edu.infnet.agenciaapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.AppPrinter;
import br.edu.infnet.agenciaapp.controller.ResponsavelController;
import br.edu.infnet.agenciaapp.model.domain.Responsavel;
import br.edu.infnet.agenciaapp.model.exception.responsavel.nameEmptyException;
import br.edu.infnet.agenciaapp.model.exception.responsavel.nameNullException;

@Component
public class ResponsavelTest implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            Responsavel r1 = new Responsavel("Thiago", "Desenvolvedor",
                    "dev@gmail.com", null);
            AppPrinter.imprimir("#Responsavel 1", r1);
            ResponsavelController.addResponsavel(r1);
        } catch (nameNullException exception) {
            System.err.println(exception);
        } catch (nameEmptyException excetion) {
            System.err.println(excetion);
        }

        try {
            Responsavel r2 = new Responsavel("Pedro", "Gerente",
                    "gerente@gmail.com", null);
            AppPrinter.imprimir("#Responsavel 2", r2);
            ResponsavelController.addResponsavel(r2);
        } catch (nameNullException exception) {
            System.err.println(exception);
        } catch (nameEmptyException excetion) {
            System.err.println(excetion);
        }

        try {
            Responsavel r3 = new Responsavel("Andre", "Proprietario",
                    "andrew@agencia.com", null);
            AppPrinter.imprimir("##Responsavel 3", r3);
            ResponsavelController.addResponsavel(r3);
        } catch (nameNullException exception) {
            System.err.println(exception);
        } catch (nameEmptyException excetion) {
            System.err.println(excetion);
        }

        try {
            Responsavel r4 = new Responsavel(null, "Proprietario",
                    "andrew@agencia.com", null);
            AppPrinter.imprimir("##Responsavel 3", r4);
            ResponsavelController.addResponsavel(r4);
        } catch (nameNullException exception) {
            System.err.println(exception);
        } catch (nameEmptyException excetion) {
            System.err.println(excetion);
        }

        try {
            Responsavel r5 = new Responsavel("", "Proprietario",
                    "andrew@agencia.com", null);
            AppPrinter.imprimir("##Responsavel 3", r5);
            ResponsavelController.addResponsavel(r5);
        } catch (nameNullException exception) {
            System.err.println(exception);
        } catch (nameEmptyException excetion) {
            System.err.println(excetion);
        }

    }

}
