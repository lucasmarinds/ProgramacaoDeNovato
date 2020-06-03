package br.com.programacaodenovato.io.streamwritersreadersscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteDeSaidaComPrintStream6 {
    public static void main(String[] args) throws FileNotFoundException {

        /**
         * Curiosidade, o PrintStream era mais usado do que os outros já existentes pelo fato que ele existe desdo
         * JDK1.0 e os outputstreram e outputWriter e inputStream e inputWriter entraram só depois, mas com eles também
         * foi criado o PrintWriter já que apenas existia o PrintStream.
         */
        PrintStream printStream = new PrintStream("luscaruscav2.txt");
        // PrintStream printStream = new PrintStream(new File("luscaruscav3.txt")); cria um arquivo.
        PrintWriter printWriter = new PrintWriter("luscaruscav2.txt");

        printStream.println("Loucura papa"); //println, pula linha igual ao system.OUT.println e veja que o OUT utiliza do printstream também.
        printStream.println("Vamo Testar isso aqui");
        printStream.println("Caramba deu certo!");

        printStream.close();
    }
}
