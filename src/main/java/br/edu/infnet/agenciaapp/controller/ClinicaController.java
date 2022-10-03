package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.agenciaapp.model.domain.Clinica;
import br.edu.infnet.agenciaapp.model.domain.Usuario;
import br.edu.infnet.agenciaapp.model.service.ClinicaService;
import br.edu.infnet.agenciaapp.model.service.ResponsavelService;

@Controller
public class ClinicaController {
    @Autowired
    private ClinicaService clinicaService;

    @Autowired
    private ResponsavelService responsavelService;

    @GetMapping(value = "/clinica/lista")
    public String telaHome(Model model, @SessionAttribute("user") Usuario usuario) {

        if(usuario.getAdmin()){
            model.addAttribute("listagem", clinicaService.obterClinicas());
        } else{
            model.addAttribute("listagem", clinicaService.obterClinicasPorUsuario(usuario.getId()));
        }

        return "/clinica/lista";
    }

    @GetMapping(value = "/clinica/incluir")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

        if(usuario.getAdmin()){
            model.addAttribute("responsaveis", responsavelService.obterResponsaveis());
        } else{
            model.addAttribute("responsaveis", responsavelService.obterResponsaveisPorUsuario(usuario.getId()));
        }

        return "clinica/cadastro";
    }

    @PostMapping(value = "/clinica/incluir")
    public String inclusao(Clinica clinica) {
        clinicaService.addClinica(clinica);

        return "redirect:/clinica/lista";
    }

    @GetMapping(value = "/clinica/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        clinicaService.excluir(id);

        return "redirect:/clinica/lista";
    }
}
