package br.edu.infnet.agenciaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NutricionistaController {
    @GetMapping(value = "/nutricionista")
    public String telaHome() {
        return "/nutricionista";
    }
}
