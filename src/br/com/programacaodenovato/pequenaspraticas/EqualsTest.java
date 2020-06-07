package br.com.programacaodenovato.pequenaspraticas;

import br.com.programacaodenovato.entitys.Estudante;
import br.com.programacaodenovato.entitys.Pessoa;

import java.util.ArrayList;

public class EqualsTest {
    public static void main(String[] args){
        ArrayList<Integer> listaInteiro = new ArrayList();
        listaInteiro.add(20);
        listaInteiro.add(22);
        listaInteiro.add(23);

        Integer a = 9;
        Integer b = 8;
        Integer c = 9;

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        Estudante a1 = new Estudante();
        Estudante a2 = new Estudante();
        a1.setNome("Juca");
        a2.setNome("Juca");

        //true pois na classe Integer ele sobreescreve o método equals e diz se os valores são o mesmo logo ele sera o mesmo.
        System.out.println(a.equals(c));

        /**
         *false pois a CLASSE INTEGER tem o EQUALS sobreescrito fazendo que ele cheque se os valores são iguais, e
         * como os valores não são iguais logo ele vai ver a alocação na memoria, assim dando false já que são variaveis
         * diferentes.
         */
        System.out.println(a.equals(b));

        /**
         * False porque como minha classe estudante não sobreescreve equals para dizer o que faz eles serem iguais
         * ou não logo vai verificar a alocação na memoria se são iguais
         */
        System.out.println(p1.equals(p2));

        //False porque por padrão o == quando se trata de objetos são inicializados em locais diferentes.
        System.out.println(p1 == p2);

        //true, pois ambos tem como o valor, e mesmo sendo Integer não estamos INSTANCIANDO O OBJETO EM SI.
        System.out.println(a == c);

        //True, porque na classe Estudante validamos se o nome de ambos são iguais e se sim então ele devolve true
        System.out.println(a1.equals(a2));

        //False porque Neste caso quando fazemos "==" com 2 instancias de objetos logo ele valida endereçamento de memoria
        System.out.println(a1 == a2);

        //True porque aqui a gente esta verificando o VALOR de uma variavel especifica e não o objeto em si.
        System.out.println(a1.getNome() == a1.getNome());
    }
}
