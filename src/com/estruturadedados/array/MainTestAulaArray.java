package com.estruturadedados.array;

import java.util.ArrayList;

public class MainTestAulaArray {
    public static void main(String[] args){
        ArrayAula  arrayAula = new ArrayAula();
        arrayAula.add(10);
        arrayAula.add(222);
        System.out.println("Elementos dentro da lista: "+arrayAula.size());
        System.out.println("Elementos Dentro da lista: "+arrayAula.toString());
        System.out.println("Elemento posição 1: "+arrayAula.getPosition(1));

        ArrayList arrayListOriginal = new ArrayList();

        arrayListOriginal.add(10);
        arrayListOriginal.add("Oi");
        arrayListOriginal.add(10.3015);

        System.out.println("Elemento ArrayList: "+arrayListOriginal.toString());
    }
}
