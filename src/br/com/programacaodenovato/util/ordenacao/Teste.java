package br.com.programacaodenovato.util.ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {
    public static void main(String[] args) {

        List lista = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < lista.size(); i++) {
            lista.add(random.nextInt(100));
            lista.add(1);
        }


        for (Object obj : lista) {
            System.out.println(obj);
        }

    }
}
