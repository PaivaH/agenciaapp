package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.agenciaapp.model.domain.Psicologo;
import br.edu.infnet.agenciaapp.model.domain.Usuario;
import br.edu.infnet.agenciaapp.model.service.ClinicaService;
import br.edu.infnet.agenciaapp.model.service.PsicologoService;

@Controller
public class PsicologoController {
    @Autowired
    private PsicologoService psicologoService;

    @Autowired
    private ClinicaService clinicaService;
    
    @GetMapping(value = "/psicologo/lista")
    public String telaHome(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", psicologoService.obterPsicologos());

        if(usuario.getAdmin()){
            model.addAttribute("listagem", psicologoService.obterPsicologos());
        } else {
            model.addAttribute("listagem", psicologoService.obterPsicologosPorUsuario(usuario.getId()));
        }

        return "/psicologo/lista";
    }

    @GetMapping(value = "/psicologo/incluir")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

        if(usuario.getAdmin()){
            model.addAttribute("clinicas", clinicaService.obterClinicas());
        } else {
            model.addAttribute("clinicas", clinicaService.obterClinicasPorUsuario(usuario.getId()));
        }

        return "psicologo/cadastro";
    }

    @PostMapping(value = "/psicologo/incluir")
    public String inclusao(Psicologo psicologo) {
        System.out.println(psicologo);
        psicologoService.addPsicologo(psicologo);

        return "redirect:/psicologo/lista";
    }

    @GetMapping(value = "/psicologo/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        psicologoService.excluir(id);

        return "redirect:/psicologo/lista";
    }
}
