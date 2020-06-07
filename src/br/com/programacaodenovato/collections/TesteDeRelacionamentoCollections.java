package br.com.programacaodenovato.collections;

import br.com.programacaodenovato.entitys.Aula;
import br.com.programacaodenovato.entitys.Curso;

import java.util.ArrayList;
import java.util.List;

public class TesteDeRelacionamentoCollections {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        List<Aula> aula = new ArrayList<>();
        cursoJava.setAulas(aula);
        aula.add(new Aula("PARTE 01 : VARIAVEIS POR VALOR E REFERENCIA",30,1));
        System.out.println(cursoJava.getAulas());
        System.out.println(aula);
        System.out.println(cursoJava.getAulas() == aula);

    }
}
