package br.com.programacaodenovato.collections;

import br.com.programacaodenovato.entitys.Estudante;

import java.util.Set;
import java.util.TreeSet;

public class TesteComTreeSet {
    public static void main(String[] args) {

        /**
         * A implementação TreeSet já ordena os seus elementos na hora da inserção. Qual é o critério da ordenação
         * depende e pode ser definido através de um Comparator ou um Comparable para fazer a ordenação natural.
         */
        Set<Estudante> estudantes = new TreeSet();

        Estudante aluno1 = new Estudante("Eduardo","duduzinhosafado@mock.com",397);
        Estudante aluno2 = new Estudante("Pablo","PabloCorno@mock.com",2);
        Estudante aluno3 = new Estudante("chimbica","chimbicaforever@mock.com",54);

        estudantes.add(aluno1);
        estudantes.add(aluno2);
        estudantes.add(aluno3);

        estudantes.forEach(estudante -> System.out.println(estudante));


    }
}
