package br.com.programacaodenovato.io.streamwritersreadersscanner;

import java.io.*;

public class TesteEscreverEmUmArquivoPeloTeclado3 {
    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = System.in; // Ele vai aceitar tudo que for escrito no console
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream outputStream = new FileOutputStream("luscaruscav2.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String linha = bufferedReader.readLine();

        while(linha != null && !linha.isEmpty()){
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
