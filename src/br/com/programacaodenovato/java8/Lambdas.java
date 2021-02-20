package br.com.programacaodenovato.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambdas {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Babu");
        palavras.add("Rondonia");
        palavras.add("Abolinação");


        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        palavras.forEach(s -> System.out.println(s));

        // palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length())); Utilizamos de lambda aqui.

        palavras.sort(Comparator.comparing(s -> s.length()));
    }
}
