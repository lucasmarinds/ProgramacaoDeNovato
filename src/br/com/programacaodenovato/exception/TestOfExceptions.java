package br.com.programacaodenovato.exception;

/**
 * Classe usada para fazer exemplo de Exceptions.
 * @author marin
 */
public class TestOfExceptions {

    public static void metodoUm() throws MyException {
        System.out.println("Inicio do Metodo Um");
        metodoDois();
        System.out.println("Fim metodo Um");
    }

    public static void metodoDois() throws MyException {
        System.out.println("Inicio do Metodo Dois");
        //Ele vai ver que no meu métodoTres ele vai jogar uma excessão e quebrar o código, então ele não vai executar aquele Método.
        try {
            metodoTres();
        }catch(MyException ex){
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Fim metodo Dois");
    }

    public static void metodoTres() throws MyException {
        System.out.println("Inicio do Metodo Tres");
        try {
            int a = 1 / 0;
        }catch(ArithmeticException e){
            //TODO pode escrever uma print ou algo que retorne se caso der erro naquela parte do código.
        }
        throw new MyException("Mensagem da minha excessão.");
        //System.out.println("Fim metodo Tres");
    }


    public static void main(String[] args) throws MyException {

        metodoUm();
        System.out.println("fim da execução");
    }
}
