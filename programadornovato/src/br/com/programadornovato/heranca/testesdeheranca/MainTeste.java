package br.com.programadornovato.heranca.testesdeheranca;

import br.com.programadornovato.heranca.ClasseB;

public class MainTeste {

    public static void main(String[] args) {

        ClasseB pessoaHerdada = new ClasseB();

        pessoaHerdada.idade = 30;
        pessoaHerdada.nome = "josue";
        pessoaHerdada.corDosOlhos = "Azul";
        
        pessoaHerdada.falar();

    }
}
