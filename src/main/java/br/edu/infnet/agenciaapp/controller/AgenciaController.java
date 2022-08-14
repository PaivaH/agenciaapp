package br.edu.infnet.agenciaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgenciaController {

    @GetMapping(value = "/agencia")
    public String telaHome() {
        return "agencia/lista";
    }
}
