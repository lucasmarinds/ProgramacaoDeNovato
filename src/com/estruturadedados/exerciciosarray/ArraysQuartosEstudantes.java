package com.estruturadedados.exerciciosarray;

import com.entitys.Estudante;

import java.util.Scanner;

public class ArraysQuartosEstudantes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Object[] quartos = new Estudante[10];

        int quantosQuartos = scanner.nextInt();

            for(int i=0; i<quantosQuartos; i++){

                Estudante estudante = new Estudante();
                scanner.nextLine();
                estudante.setNome(scanner.nextLine());
                estudante.setEmail(scanner.next());

                int escolherQuarto = scanner.nextInt();

                    if(quartos[escolherQuarto] == null){
                        quartos[escolherQuarto] = estudante;
                    }else
                    System.out.println("Quarto OCUPADO!");
            }

            for(int i=0; i<quartos.length; i++){
                if(quartos[i] != null) {
                    System.out.println(i+": " + quartos[i].toString());
                }
            }

    }
}
