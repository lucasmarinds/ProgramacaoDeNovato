package com.estruturadedados.util.ordenacao;

import com.entitys.Estudante;

import java.util.ArrayList;
import java.util.List;

public class ListaTesteOrdenacao {

    public static void main(String[] args){
        List lista = new ArrayList<Estudante>();

        Estudante aluno = new Estudante("Doritos","doritos@hotquente.com",23);
        Estudante aluno2 = new Estudante("Fandangos","fandangos@xoxo.com",11);
        Estudante aluno3 = new Estudante("Baconzitos","baconzitos@ggmai.com",10);
        Estudante aluno4 = new Estudante("Ruffles","Ruffles@miola.com",1);

        lista.add(aluno);
        lista.add(aluno2);
        lista.add(aluno3);
        lista.add(aluno4);
        System.out.println(lista.toString());
        TesteOrdenacaoLista ordenarPorId = new TesteOrdenacaoLista();
        lista.sort(ordenarPorId);
        System.out.println(lista.toString());
    }
}