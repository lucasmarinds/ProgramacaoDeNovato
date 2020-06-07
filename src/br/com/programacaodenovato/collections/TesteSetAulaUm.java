package br.com.programacaodenovato.collections;

import br.com.programacaodenovato.entitys.Estudante;

import java.util.HashSet;
import java.util.Set;

public class TesteSetAulaUm {
    public static void main(String[] args) {
        /**
         * voce não tem garantia a ordem que fica dentro do conjunto de objetos(set),
         * quando se trabalha com set ele não permite repetições dentro de seu conjunto, por exemplo o MLusca ele só
         * aparece 1 vez e só conta 1 vez no sysout, por trabalhar por de baixo dos panos com uma tabela de espalhamento
         * logo ele vai ser mais rapido para poder fazer remoções e buscar, se utiliza Listas CASO seja realmente preciso
         * de ORDENAÇÂO E SE CASO PRECISE ACESSAR UM OBJETO DIRETAMENTE UM ARRAYLIST
         */
        Set<String> estudantes = new HashSet<>();

        estudantes.add("Mayara");
        estudantes.add("MLusca");
        estudantes.add("MLusca");
        estudantes.add("MRusca");
        estudantes.add("Jubiliu");
        estudantes.add("Aliu");
        System.out.println(estudantes.size()); //Repare que aqui ele vai lhe retornar o valor 5 mesmo havendo 6.
        System.out.println(estudantes);

        boolean MayaraMatriculada = estudantes.contains("Mayara");
        System.out.println(MayaraMatriculada);

        /**
         * // perceba que aqui a gente não é igual as lists, aqui você escreve o valor que quer retirar e isso será
         * feito, não é igual listas porque não podemos esquececr que o conjunt oSET não trabalha com posições.
         */
        estudantes.remove("MRusca");


        estudantes.forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}
