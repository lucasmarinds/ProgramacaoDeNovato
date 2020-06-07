package br.com.programacaodenovato.collections;

import br.com.programacaodenovato.entitys.Aula;
import br.com.programacaodenovato.entitys.Curso;
import br.com.programacaodenovato.entitys.Estudante;

import java.util.ArrayList;
import java.util.List;

public class TesteBuscaMapa {
    public static void main(String[] args) {

        /**
         * O elemento do hashmap foi entroduzido na classe cursoJava com o nome de buscaPorIdentidade();
         * Também existe o tipo de de Map que é o HashTable que pode ser chamado de thread safe, ele vai ser seguro
         * quando houver varias threads rodando em cima dele.
         * E TAMBEM EXISTE O LinkedHashMap que guarda os valores em ordem e ainda funciona da mesma maneira que o hashmap normal
         */
        Curso cursoJava = new Curso();
        List<Aula> aulaList = new ArrayList();

        aulaList.add(new Aula("PARTE 2 Metodos e Atributos",30,2));
        aulaList.add(new Aula("PARTE 3 Estrutura Condicionais",30,3));
        aulaList.add(new Aula("PARTE 4 Estrutura de Repeticao",60,4));
        aulaList.add(new Aula("PARTE 5 Classes e Objetos",60,5));
        aulaList.add(new Aula("PARTE 1 Variaveis por Valor e Referencia",30,1));

        Estudante lucas = new Estudante("Lucas","lucas@mock.com",567);
        Estudante majara = new Estudante("Mayara","mayara@mock.com",222);
        Estudante renan = new Estudante("Renan","renan@mock.com",1683);

        cursoJava.setAulas(aulaList);
        cursoJava.matricularAluno(lucas);
        cursoJava.matricularAluno(majara);
        cursoJava.matricularAluno(renan);

        System.out.println("Quem é o estudando com identidade 222:");
        Estudante estudanteDeBusca = cursoJava.buscaPorIdentidade(22122);
        System.out.println(estudanteDeBusca);
    }
}
