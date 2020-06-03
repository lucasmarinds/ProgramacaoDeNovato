package br.com.programacaodenovato.io.streamwritersreadersscanner;

import java.io.*;

public class TesteDeEntradaPadrao0 {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo em binario que fica na RAIZ DO PROJETO;
        InputStream fileInputStream = new FileInputStream("luscarusca.txt");
        //Fluxo de entrada que faz a transformações de bytes(fileinputStream) em caracteres(InputStreamReader) > Binario para Caracteres
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        //Ele guarda os caracteres de uma linha e consegue ler as linhas.
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
