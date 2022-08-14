package br.edu.infnet.agenciaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResonsavelController {
    @GetMapping(value = "/responsavel")
    public String telaHome() {
        return "/responsavel";
    }
}
