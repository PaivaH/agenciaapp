package br.edu.infnet.agenciaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PsicologoController {
    @GetMapping(value = "/psicologo")
    public String telaHome() {
        return "/psicologo";
    }
}
