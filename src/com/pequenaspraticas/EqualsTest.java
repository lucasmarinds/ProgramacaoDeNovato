package com.pequenaspraticas;

import java.util.ArrayList;

public class EqualsTest {
    public static void main(String[] args){
        ArrayList<Integer> listaInteiro = new ArrayList();
        int idade = 10;
        listaInteiro.add(idade);
        listaInteiro.add(1);
        listaInteiro.add(20);
        listaInteiro.add(20);

        boolean resultado = listaInteiro.get(2).equals(listaInteiro.get(1));
        System.out.println(resultado);

        boolean resultadoDois = listaInteiro.get(2) == listaInteiro.get(1);
        System.out.println(resultadoDois);

        boolean resultadoTres = listaInteiro.get(0) == listaInteiro.get(1);
        System.out.println(resultadoTres);

    }
}
