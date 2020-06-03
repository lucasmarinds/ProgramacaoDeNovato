package br.com.programacaodenovato.io.serializacao;

import br.com.programacaodenovato.entitys.ContaCorrente;
import br.com.programacaodenovato.entitys.Estudante;
import br.com.programacaodenovato.entitys.Pessoa;

import java.io.*;

public class TesteSerializacaoComHeranca {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /**
         * ANOTAÇÔES LER, quando se trata de heranca e a classe mae tem a interface Serializable, as classes filhas
         * podem ser serializadas sem problemas, mas quando há como um componente da classe outra classe ela for servir
         * como parametro para sua classe ela não implementar a interface vai retornar um NotSerializableException também
         * no caso da ContaCorrente se eu tentar colocar ela dentro do método .setContaAluno() e ela não estiver com a
         * interface implementada ela retornara a exception, mas se eu não passar valor para esse meu atributo, sera
         * serializado como null, logo está classe não existe então não vai impactar.
         */
        Pessoa p1 = new Pessoa();
        p1.setIdade(30);
        p1.setSexo('M');
        p1.setNome("Ugo");

        //Tem testes feitos utilizando essa classe então acompanhe na classe Entitys na classe Estudante;
        ContaCorrente contaUm = new ContaCorrente();
        contaUm.setAgencia(255);
        contaUm.setNumeroDaConta(246699);

        Estudante estudante = new Estudante();
        estudante.setEstudante(p1);
        estudante.setContaAluno(contaUm);
        estudante.setEmail("ugodastrevas@gmail.com");

        /**
         * Fluxo binario:
         * 41 line - gera o arquivo do tipo bin.
         * 42 line - grava no meu bin o meu objeto estudante
         * 43 line - fecha a utilização do meu recurso instanciado
         */
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("estudante.bin"));
        objectOutputStream.writeObject(estudante);
        objectOutputStream.close();

        /**
         * Fluxo de Entrada do binario:
         * 55 line - recebe ccomo entrada o arquivo que foi criado pelo FileoutputStream
         * 56 line - ele faz com que você adicione ao throws na classe com ClassNotFoundException porque, caso você
         * utilize do método readObject e a classe não existe mais ele retornara esse exception, e de volta como
         * já sabemos qual classe a gente transformou então criamos uma referencia daquele tipo e fazemos um cast no
         * retorno do método e assim podemos acessar os atributos de nosso aluno
         * 57 line - fechamos a utilização do nosso recurso instanciado.
         * 58 line - fazemos acesso aos métodos de nosso objeto que esta dentro do bin.
         */
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("estudante.bin"));
        Estudante aluno = (Estudante) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(aluno.getEmail());


    }
}
