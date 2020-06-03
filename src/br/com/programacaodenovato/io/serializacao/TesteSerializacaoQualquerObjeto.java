package br.com.programacaodenovato.io.serializacao;

import br.com.programacaodenovato.entitys.Estudante;

import java.io.*;

public class TesteSerializacaoQualquerObjeto {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /**
         * Quando queremos fazer a serialização de um objeto, é necessário que a classe implemente a interface no
         * caso tenha o contrato Serializable que permite a classe poder ser serializada.
         */
        Estudante estudante = new Estudante();
        estudante.setEmail("mock@gmail.com");
        estudante.setNome("Lusca");
        estudante.setId(2408);

        //Cria o bin
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("estudante.bin"));
        objectOutputStream.writeObject(estudante);
        objectOutputStream.close();

        //Serializa o objeto e mostra o valor de dentro dele, é necessario fazer o cast para a classe que foi usada para criar o bin.
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("estudante.bin"));
        Estudante nome = (Estudante) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(nome.getEmail());

    }
}
