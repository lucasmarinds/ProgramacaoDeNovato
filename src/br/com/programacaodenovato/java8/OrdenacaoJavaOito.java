package br.com.programacaodenovato.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenacaoJavaOito {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Babu");
        palavras.add("Rondonia");
        palavras.add("Abolinação");

        System.out.println(palavras);
        Collections.sort(palavras); // utiliza do comparable que já existe na classe String que é a ordenação natural
        System.out.println(palavras);

        comparadorString comparadorPorTamanho = new comparadorString();
        Collections.sort(palavras,comparadorPorTamanho);
        System.out.println(palavras);

        palavras.sort(null); //passando null o seu sort faz com que pegue e utilize do comparable
        System.out.println(palavras);

        palavras.sort(comparadorPorTamanho);
        System.out.println(palavras);

        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        //nova maneira de fazer o forEach
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //Utilizamos de classe anonima aqui,  já que utilizamos apenas 1 método assim poupamos de criar uma nova classe para isso.
        //é o mesmo que o forEach de cima só que utilizando lambda.
        palavras.forEach((String s) ->{
            System.out.println(s);
            });
    }


}

class comparadorString implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return -1;
        } else {
            return 1;
        }
    }
}