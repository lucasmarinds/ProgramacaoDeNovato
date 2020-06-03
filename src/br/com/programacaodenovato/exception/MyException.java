package br.com.programacaodenovato.exception;

public class MyException extends Exception{

    public MyException(){

    }

    public MyException(String mensagem){
        super(mensagem);
    }
}
