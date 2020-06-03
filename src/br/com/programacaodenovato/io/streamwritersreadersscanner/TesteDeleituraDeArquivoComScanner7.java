package br.com.programacaodenovato.io.streamwritersreadersscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteDeleituraDeArquivoComScanner7 {
    public static void main(String[] args) throws FileNotFoundException {

        //Ele recebe o File e apartir do file ele vai utilizar seus métodos e ler este arquivo
        Scanner scanner = new Scanner(new File("contas.csv"));

        while(scanner.hasNextLine()){ //se a proxima linha do scanner for null então é retorna falso e sai do enquanto

            String linha = scanner.nextLine();
            //System.out.println(linha);
            Scanner scannerLinha = new Scanner(linha);
            scannerLinha.useLocale(Locale.US); //agora o scanner vai entender que o numero é com ponto flutuante apertir do "." já que é o padrão americano.
            scannerLinha.useDelimiter(","); //pattern é igual um regex, o scanner vai separar os caracteres apartir da ",";

            String tipoConta = scannerLinha.next();
            int numeroAgencia = scannerLinha.nextInt();
            int numeroConta = scannerLinha.nextInt();
            String nomeTitular = scannerLinha.next();
            double saldoConta = scannerLinha.nextDouble();

            String valoresFormatados = String.format("%s %04d-%07d, %s %05.3f",tipoConta,numeroAgencia,numeroConta,nomeTitular,saldoConta);
            System.out.println(valoresFormatados);

            //String[] valores = linha.split(","); //separa os valores apartir da virgula dentro do array
            //System.out.println(valores[3]); //trás o terceiro valor do array que no caso seria o nome
            //System.out.println(Arrays.toString(valores)); mostra separadamente as virgulas de cada elemento
        }
    }
}
