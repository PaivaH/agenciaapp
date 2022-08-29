package br.edu.infnet.agenciaapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.domain.Agencia;

@Controller
public class AgenciaController {
    public static Map<Integer, Agencia> agencias = new HashMap<Integer, Agencia>();
    public static Integer id = 0;

    public static void addAgencia(Agencia agencia){
        agencia.setId(++id);
        agencias.put(id, agencia);
    }

    public static Collection<Agencia> obterAgencias() {
        return agencias.values();
    }

    public static void excluir(Integer id) {
        agencias.remove(id);
        System.out.println(id + " Excluido com sucesso");
    }

    @GetMapping(value = "/agencia/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", obterAgencias());

        return "/agencia/lista";
    }

    @GetMapping(value = "/agencia/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);

        return "redirect:/agencia/lista";
    }
}
