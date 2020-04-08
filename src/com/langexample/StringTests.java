package com.langexample;

public class StringTests {

    public static void main(String[] args) {

        String nome = "Marmin";

        //Caso não queira criar uma nova String apenas altere seu valor diretamente.
         nome = nome.replace("M", "B");
         String nomeAlterado = nome.replace("M", "B");

        //Aqui você verá as mudanças porque a nova String recebe a modificação da String nome que não pode ser alterado.
        System.out.println(nomeAlterado);
        //Aqui o valor continuara igual mesmo dando replace, porque String é um tipo imutavel apartir do momento que é inicializado.
        System.out.println(nome);

        /**
         * Modificação usando char que é um tipo primitivo que recebe apenas 1 valor no caso 1 letra.
         */
        char a = 'M';
        char b = 'B';

        String nomeDois = "Marinho Gordo ";
        String nomeDoisAlterado = nomeDois.replace(a,b);
        System.out.println(nomeAlterado);

        //Retorna um valor na posicao especifico da string.
        System.out.println(nomeAlterado.charAt(1)); // output = a;

        //Método trim que remove espaços dentro da String.
        String nomeSemEspaco = nomeDois.trim();
        System.out.println(nomeDois); // com espaço no fim.
        System.out.println(nomeSemEspaco); // sem espaço no fim.

    }
}
