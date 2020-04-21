package com.estruturadedados.exerciciosarray;

import com.entitys.Produto;

import java.util.Scanner;

public class ArrayProdutos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int soma=0;

        int numeroDeProdutos = scanner.nextInt();
        Object[] listaProdutos = new Produto[numeroDeProdutos];


        for(int i=0; i<numeroDeProdutos; i++){
            Produto produto = new Produto();
            produto.setNome(scanner.next());
            produto.setPreco(scanner.nextDouble());
            soma += produto.getPreco();
            listaProdutos[i] = produto;
        }

        double total = soma/numeroDeProdutos;

//        for (int i=0; i<numeroDeProdutos; i++){
//            System.out.println("--------------");
//            System.out.println(listaProdutos[i]);
//            System.out.println("--------------");
//        }

        System.out.println(total);

    }
}
