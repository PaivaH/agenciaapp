package br.edu.infnet.agenciaapp.model.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.agenciaapp.model.domain.app.Atributo;
import br.edu.infnet.agenciaapp.model.domain.app.Classe;
import br.edu.infnet.agenciaapp.model.domain.app.Projeto;
import br.edu.infnet.agenciaapp.model.service.AppService;

@Component
public class AppTest implements ApplicationRunner {
    @Autowired
    AppService appService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            FileReader fr = new FileReader("src/main/resources/static/app.txt");
            BufferedReader leitura = new BufferedReader(fr);

            Projeto projeto = null;
            List<Classe> classes = null;
            List<Atributo> atributos = null;

            String linha = leitura.readLine();
            while (linha != null) {
                String[] campos = linha.split(";");

                switch (campos[0].toUpperCase()) {
                    case "P":
                        classes = new ArrayList<>();
                        projeto = new Projeto();
                        projeto.setNome(campos[1]);
                        projeto.setDescricao(campos[2]);
                        projeto.setClasses(classes);
                        break;

                    case "C":
                        atributos = new ArrayList<>();
                        Classe classe = new Classe();
                        classe.setNome(campos[1]);
                        classe.setAtributos(atributos);
                        classes.add(classe);
                        break;

                    case "A":
                        Atributo atributo = new Atributo(campos[1], campos[2], campos[3]);
                        atributos.add(atributo);
                        break;
                }

                linha = leitura.readLine();
            }

            appService.incluir(projeto);
            
            leitura.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Erro");
        }

    }

}
