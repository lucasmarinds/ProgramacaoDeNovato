package br.com.programacaodenovato.io;

import java.nio.charset.Charset;

public class TesdeUnicodeEEnconding8 {
    public static void main(String[] args) {

        String c = "C";
        System.out.println(c.codePointAt(0)); // ? valor de 67 sendo o mesmo codepoint da tabela ASCII

        Charset charSet = Charset.defaultCharset(); //pega o default charset da maquina do usuario
        System.out.println(charSet.displayName()); //mostra qual o charset que o sistema esta utilizando


    }
}
