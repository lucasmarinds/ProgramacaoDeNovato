package br.com.programacaodenovato.io.serializacao;

import br.com.programacaodenovato.entitys.Estudante;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        String nome = "Lucas";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        objectOutputStream.writeObject(nome);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nomeAposSerializar = (String) objectInputStream.readObject();
        //Estudante nome = (Estudante) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(nomeAposSerializar);
    }
}
