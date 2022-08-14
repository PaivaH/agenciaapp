package br.edu.infnet.agenciaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfissionalController {
    @GetMapping(value = "/profissional")
    public String telaHome() {
        return "/profissional";
    }
}
