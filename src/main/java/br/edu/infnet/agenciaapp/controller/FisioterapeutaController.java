package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.agenciaapp.model.domain.Fisioterapeuta;
import br.edu.infnet.agenciaapp.model.domain.Usuario;
import br.edu.infnet.agenciaapp.model.service.ClinicaService;
import br.edu.infnet.agenciaapp.model.service.FisioterapeutaService;

@Controller
public class FisioterapeutaController {
    @Autowired
    private FisioterapeutaService fisioterapeutaService;

    @Autowired
    private ClinicaService clinicaService;

    @GetMapping(value = "/fisioterapeuta/lista")
    public String telaHome(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", fisioterapeutaService.obterFisioterapeutas());

        if(usuario.getAdmin()){
            model.addAttribute("listagem", fisioterapeutaService.obterFisioterapeutas());
        } else {
            model.addAttribute("listagem", fisioterapeutaService.obterFisioterapeutasPorUsuario(usuario.getId()));
        }

        return "/fisioterapeuta/lista";
    }

    @GetMapping(value = "/fisioterapeuta/incluir")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

        if(usuario.getAdmin()){
            model.addAttribute("clinicas", clinicaService.obterClinicas());
        } else {
            model.addAttribute("clinicas", clinicaService.obterClinicasPorUsuario(usuario.getId()));
        }

        return "fisioterapeuta/cadastro";
    }

    @PostMapping(value = "/fisioterapeuta/incluir")
    public String inclusao(Fisioterapeuta fisioterapeuta) {
        System.out.println(fisioterapeuta);
        fisioterapeutaService.addFisioterapeuta(fisioterapeuta);

        return "redirect:/fisioterapeuta/lista";
    }
    
    @GetMapping(value = "/fisioterapeuta/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        fisioterapeutaService.excluir(id);

        return "redirect:/fisioterapeuta/lista";
    }
}
