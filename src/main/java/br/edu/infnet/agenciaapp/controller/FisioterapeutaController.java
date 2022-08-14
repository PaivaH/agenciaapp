package br.edu.infnet.agenciaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FisioterapeutaController {
    @GetMapping(value = "/fisioterapeuta")
    public String telaHome() {
        return "/fisioterapeuta";
    }
}
