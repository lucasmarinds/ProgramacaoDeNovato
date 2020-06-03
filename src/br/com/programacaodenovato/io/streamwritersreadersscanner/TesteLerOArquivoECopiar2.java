package br.com.programacaodenovato.io.streamwritersreadersscanner;

import java.io.*;

public class TesteLerOArquivoECopiar2 {
    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = new FileInputStream("luscarusca.txt");
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream outputStream = new FileOutputStream("luscaruscav2.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String linha = bufferedReader.readLine();

        while(linha != null){
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
