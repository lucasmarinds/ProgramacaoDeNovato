package br.com.programacaodenovato.collections;

import br.com.programacaodenovato.entitys.Aula;
import br.com.programacaodenovato.entitys.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteDeRelacionamentoCollectionDois {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();

        List<Aula> aulaList = new ArrayList();
        aulaList.add(new Aula("PARTE 2 Metodos e Atributos",30,2));
        aulaList.add(new Aula("PARTE 3 Estrutura Condicionais",30,3));
        aulaList.add(new Aula("PARTE 4 Estrutura de Repeticao",60,4));
        aulaList.add(new Aula("PARTE 5 Classes e Objetos",60,5));
        aulaList.add(new Aula("PARTE 1 Variaveis por Valor e Referencia",30,1));

        cursoJava.setAulas(aulaList);

        List<Aula> aulasImutavel = cursoJava.getAulas();
        //Collections.sort(aulasImutavel);//Não consegue pois ele ta retornando uma lista que é apenas para ler e não modificar logo vai lanchar a exception UnsupportedOperationException
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutavel); //me gera uma nova lista copiando a imutavel para eu poder ordenar ela.
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        //nesse trecho aqui eu usei diretamente a minha lista logo não ia dar problemas.
        //Collections.sort(aulaList);
        //System.out.println(cursoJava.getCurso());



    }
}
