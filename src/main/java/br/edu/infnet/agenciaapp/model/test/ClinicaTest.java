package br.edu.infnet.agenciaapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.AppPrinter;
import br.edu.infnet.agenciaapp.model.domain.Clinica;
import br.edu.infnet.agenciaapp.model.exception.clinica.cnpjEmptyException;
import br.edu.infnet.agenciaapp.model.exception.clinica.cnpjNullException;
import br.edu.infnet.agenciaapp.model.service.ClinicaService;

@Component
@Order(1)
public class ClinicaTest implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            Clinica ag1 = new Clinica("Clinica1", "12346789", "Rua A, 235, Centro",
                    null, null);
            AppPrinter.imprimir("#Clinica1", ag1);
            new ClinicaService().addClinica(ag1);

        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Clinica ag2 = new Clinica("Clinica2", "2312245", "Rua B, 3123, Centro",
                    null, null);
            AppPrinter.imprimir("#Clinica2", ag2);
            new ClinicaService().addClinica(ag2);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Clinica ag3 = new Clinica("Clinica3", "5122453", "Rua D, 3423, Centro",
                    null, null);
            AppPrinter.imprimir("#Clinica3", ag3);
            new ClinicaService().addClinica(ag3);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Clinica ag4 = new Clinica("Clinica4", "", "Rua D, 3423, Centro",
                    null, null);
            AppPrinter.imprimir("#Clinica3", ag4);
            new ClinicaService().addClinica(ag4);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Clinica ag5 = new Clinica("Clinica3", null, "Rua D, 3423, Centro",
                    null, null);
            AppPrinter.imprimir("#Clinica3", ag5);
            new ClinicaService().addClinica(ag5);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }
    }

}
