package br.edu.infnet.agenciaapp.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.AppPrinter;
import br.edu.infnet.agenciaapp.controller.AgenciaController;
import br.edu.infnet.agenciaapp.model.domain.Agencia;
import br.edu.infnet.agenciaapp.model.exception.agencia.cnpjEmptyException;
import br.edu.infnet.agenciaapp.model.exception.agencia.cnpjNullException;

@Component
@Order(1)
public class AgenciaTest implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            Agencia ag1 = new Agencia("Agencia 1", "12346789", "Rua A, 235, Centro",
                    null, null);
            AppPrinter.imprimir("#Agencia 1", ag1);
            AgenciaController.addAgencia(ag1);

        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Agencia ag2 = new Agencia("Agencia 2", "2312245", "Rua B, 3123, Centro",
                    null, null);
            AppPrinter.imprimir("#Agencia 2", ag2);
            AgenciaController.addAgencia(ag2);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Agencia ag3 = new Agencia("Agencia 3", "5122453", "Rua D, 3423, Centro",
                    null, null);
            AppPrinter.imprimir("#Agencia 3", ag3);
            AgenciaController.addAgencia(ag3);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Agencia ag4 = new Agencia("Agencia 4", "", "Rua D, 3423, Centro",
                    null, null);
            AppPrinter.imprimir("#Agencia 3", ag4);
            AgenciaController.addAgencia(ag4);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Agencia ag5 = new Agencia("Agencia 3", null, "Rua D, 3423, Centro",
                    null, null);
            AppPrinter.imprimir("#Agencia 3", ag5);
            AgenciaController.addAgencia(ag5);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }
    }

}
