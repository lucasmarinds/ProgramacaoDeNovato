package br.com.programacaodenovato.java8;

import java.lang.reflect.Array;
import java.util.*;

public class OrdenarStrings {
    public static void main(String[] args){
        List<String> listaPalavras = new ArrayList<>();

        listaPalavras.add("Oi Lusca Rusca");
        listaPalavras.add("Pipino");
        listaPalavras.add("Coiso");
        listaPalavras.add("Adicao");

        System.out.println(listaPalavras);
        Collections.sort(listaPalavras);
        System.out.println(listaPalavras);


    }
}
class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(),o2.length());
    }
}