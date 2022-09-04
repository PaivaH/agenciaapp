package br.edu.infnet.agenciaapp.model.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.edu.infnet.agenciaapp.AppPrinter;

@Component
@Order()
public class Test implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Digite qualquer coisa");
        AppPrinter.readFromFile("agencia");
        ObjectMapper mapper = new ObjectMapper();
        /*Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println("Texto: " + s); */
/*      String datetime = "01/08/2022 10:42";
        LocalDateTime localDateTime = LocalDateTime.parse(datetime, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(localDateTime); */
    }
    
}
