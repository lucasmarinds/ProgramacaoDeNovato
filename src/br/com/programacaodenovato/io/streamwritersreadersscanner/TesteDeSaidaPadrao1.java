package br.com.programacaodenovato.io.streamwritersreadersscanner;

import java.io.*;

public class TesteDeSaidaPadrao1 {
    public static void main(String[] args) throws IOException {

        //Fluxo de SAIDA de um arquivo em bytes na RAIZ DO código;
        OutputStream outputStream = new FileOutputStream("luscaruscav2.txt");

        //Fluxo de saida que vai transformar nossos caracteres em bytes;
        Writer writer = new OutputStreamWriter(outputStream);

        //Fluxo de entrada de caracteres para nosso arquivo; como o outro ele recebe uma string completa e transforma em caracteres e manda para writer
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Meu nome é Lusca Rusca Busca Fusca");
        bufferedWriter.newLine();//Adiciona mais uma linha para poder escrever
        bufferedWriter.write("123456, olha corno");

        bufferedWriter.close();

    }
}
