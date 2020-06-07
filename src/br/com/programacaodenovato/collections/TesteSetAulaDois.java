package br.com.programacaodenovato.collections;

import br.com.programacaodenovato.entitys.Aula;
import br.com.programacaodenovato.entitys.Curso;
import br.com.programacaodenovato.entitys.Estudante;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Aula para utilizar classes para adicionar e usar mesmos conceitos que foi usado nas listas.
 */
public class TesteSetAulaDois {
    public static void main(String[] args) {
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

        System.out.println(cursoJava.getAlunos());
        System.out.println("O Aluno Lucas esta matriculado? "+cursoJava.alunoEstaMatriculado(lucas));

        Estudante marin = new Estudante("Lucas","lucas@mock.com",567);
        System.out.println("Este Marin esta matriculado?"+ cursoJava.alunoEstaMatriculado(marin));

        //true por causa que o Estudando checa se o nome é igual
        System.out.println("Lucas é equals ao Marin ?"+lucas.equals(marin));

        System.out.println("O Hashcode é igual ?"+ (lucas.hashCode() == marin.hashCode()));

        System.out.println("-------------------");

        Set<Estudante> alunos = cursoJava.getAlunos();

        //Formas de percorrer listas de maneiras diferentes

        alunos.forEach(estudante -> System.out.println(estudante)); //utilizando lambdas dps do JAVA 8


        System.out.println("-------------------");

        for(Estudante objeto: alunos){ //percorrer um set antes do java 8
            System.out.println(objeto);
        }

        System.out.println("-------------------");
        //Todas as collection tem o método .iterator();
        Iterator<Estudante> iterador = alunos.iterator(); //Jeito de percorrer listas ao modo antigo do meu avó.

        while (iterador.hasNext()){//Iterator você tem proximo? se sim continua se não ele sai do enquanto.
            Estudante estudante = iterador.next(); //ele devolve para estudante o aluno que ele encontrar.
            System.out.println(estudante);
        }

    }
}
