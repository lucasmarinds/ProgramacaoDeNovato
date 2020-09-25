package br.com.programacaodenovato.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlturaPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Para poder fazer receber entradas por "." e não ","
        Scanner scanner = new Scanner(System.in);
        int div = 0;
        double somar=0;

        int entradaNumeros = scanner.nextInt();
        double[] alturas = new double[entradaNumeros];

        for(int i=0; i<entradaNumeros; i++){
            alturas[i] = scanner.nextDouble();
            somar += alturas[i];
            div++;
        }

       double total = somar / div;

        System.out.printf("%.2f%n",total);
    }
}
