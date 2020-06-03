package br.com.programacaodenovato.util.ordenacao;

import br.com.programacaodenovato.entitys.Produto;

import java.util.Comparator;

public class TesteOrdenacaoLista implements Comparator<Produto> {

    /**
     * É no comparator que decidimos o criterio de ordenação da nossa lista, como por exemplo nesse exemplo que quero
     * que ele organize pelo ID do meu aluno.
     */
    @Override
    public int compare(Produto a, Produto b) {

        /**
         * Primeira forma e mais legivel de se fazer uma Ordenação do tipo inteiro.
         */
        return Integer.compare(a.getId(),b.getId());

        /**
         * Segundo forma para se fazer a ordenação.
         * return a.getid() - b.getid();
         */

        /**
         * Terceira forma para se fazer a ordenação
         *         if(a.getid() > b.getid()) {
         *             return 1;
         *         }
         *         else if(a.getid() < b.getid()){
         *             return -1;
         *         }
         *         return 0;
         */
    }
}
