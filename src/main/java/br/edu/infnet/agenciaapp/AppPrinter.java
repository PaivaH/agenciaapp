package br.edu.infnet.agenciaapp;

import br.edu.infnet.agenciaapp.model.domain.IPrinter;

public class AppPrinter {
    public static void imprimir(String mensagem, IPrinter printer){
        System.out.println(mensagem);

        printer.impressao();
    }
}
