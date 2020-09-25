package br.com.programacaodenovato.pequenaspraticas;

public class Repeticao {

    public static void pares(Integer n1,Integer n2){
        for(int i = n1; i < n2; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[]args){
        pares(1,11);
    }
}
