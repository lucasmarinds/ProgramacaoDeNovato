package br.com.programacaodenovato.util.ordenacao;

import br.com.programacaodenovato.entitys.Estudante;

import java.util.ArrayList;
import java.util.List;

public class ListaTesteOrdenacao {

    public static void main(String[] args){
        List lista = new ArrayList<Estudante>(1);

        Estudante aluno = new Estudante("Doritos","doritos@hotquente.com",23);
        Estudante aluno2 = new Estudante("Fandangos","fandangos@xoxo.com",11);
        Estudante aluno3 = new Estudante("Baconzitos","baconzitos@ggmai.com",10);
        Estudante aluno4 = new Estudante("Ruffles","Ruffles@miola.com",1);

        lista.add(aluno);
        lista.add(aluno2);
        lista.add(aluno3);
        lista.add(aluno4);
        System.out.println(lista.toString());

        /**Poderia te sido colocado dessa forma a alteração porém ela é pior pelo fato ter que ficar passando ela para uma referencia
         *TesteOrdenacaoLista ordenarPorId = new TesteOrdenacaoLista();
         *lista.sort(ordenarPorId);
         */

        /**
         * Outra Maneira de poder se utilizar a nossa ordenação criada,porém continua não sendo a melhor.
         * lista.sort(new TesteOrdenacaoLista());
         */

        /**
         * E por fim utilizando a classe COLLECTIONS da lib UTILs com varios métodos staticos que nos permite utilizar ordenar uma lista
         *Collections.sort(lista,new TesteOrdenacaoLista());
         */

        //Utilizando a ordem Natural criada na classe estudante
        lista.sort(null);

        System.out.println(lista.toString());
    }
}