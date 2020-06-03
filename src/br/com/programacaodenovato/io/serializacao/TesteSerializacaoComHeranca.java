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

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("estudante.bin"));
        objectOutputStream.writeObject(estudante);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("estudante.bin"));
        Estudante aluno = (Estudante) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(aluno.getEmail());


    }
}
