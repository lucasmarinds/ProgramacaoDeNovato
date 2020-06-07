package br.com.programacaodenovato.collections;

import br.com.programacaodenovato.entitys.Estudante;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TesteLinkedHashSet {
    public static void main(String[] args) {

        /**
         * Esse tipo de HashSet sendo o LinkedHashSet só te proporciona guardar em ordem o que é adicionado nele
         * porém ainda não contém a busca por posição porque não podemos esquecer que estamos mexendo com coleções.
         */
        Set<Estudante> estudantes = new LinkedHashSet<>();

        Estudante lucas = new Estudante("Lucas","lucas@mock.com",567);
        Estudante majara = new Estudante("Mayara","mayara@mock.com",222);
        Estudante renan = new Estudante("Renan","renan@mock.com",1683);

        estudantes.add(lucas);
        estudantes.add(majara);
        estudantes.add(renan);

        //Formas de fazer for

        estudantes.forEach(estudante -> System.out.println(estudante)); //utilizando lambdas dps do JAVA 8


        System.out.println("-------------------");

        for(Estudante objeto: estudantes){ //percorrer um set antes do java 8
            System.out.println(objeto);
        }

        System.out.println("-------------------");

    }
}
