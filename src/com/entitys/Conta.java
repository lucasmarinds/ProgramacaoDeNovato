package com.entitys;

public class Conta {

        int numero;
        String nome;

        public static void main(String[] args) {
                Conta  c1 = new Conta();
                Conta  c2 = new Conta();
                Conta  c3 = new Conta();
                c1.nome = "Ravi";
                c1.numero = 1;
                c2.nome = "Ram";
                c2.numero = 2;
                c3.nome = "Ram";
                c3.numero = 2;
                System.out.println(c1.equals(c2));
                System.out.println(c2.nome.equals(c3.nome));
        }

}
