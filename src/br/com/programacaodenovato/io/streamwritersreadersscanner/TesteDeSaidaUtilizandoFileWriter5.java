package br.com.programacaodenovato.io.streamwritersreadersscanner;

import java.io.*;

public class TesteDeSaidaUtilizandoFileWriter5 {
    public static void main(String[] args) throws IOException {

//        OutputStream outputStream = new FileOutputStream("luscaruscav2.txt");
//        Writer writer = new OutputStreamWriter(outputStream);
//        BufferedWriter bufferedWriter = new BufferedWriter(writer);

//        FileWriter fileWriter = new FileWriter("luscaruscav2.txt"); // ele faz praticamente tudo o que a operação a cima faz
//       BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); //Mas continuo usando o bufferedWriter porque ele tem método melhores e embrulha o nosso filewriter

        //Outra maneira de fazer a mesma coisa que os passos a cima.
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("luscaruscav2.txt"));

//        fileWriter.write("Meu nome é Lusca Rusca Busca Fusca");
//        fileWriter.write(System.lineSeparator());
//        fileWriter.write(System.lineSeparator());
//        fileWriter.write(System.lineSeparator());
//        fileWriter.write("Meu nome é dudu e sou duduido");

        bufferedWriter.write("Meu nome é Lusca Rusca Busca Fusca");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("Meu nome é dudu e sou duduido");

        bufferedWriter.close();

    }
}
