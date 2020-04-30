package com.estruturadedados.util.ordenacao;
import com.entitys.Estudante;

import java.util.Comparator;

public class TesteOrdenacaoLista implements Comparator<Estudante> {

    /**
     * É no comparator que decidimos o criterio de ordenação da nossa lista, como por exemplo nesse exemplo que quero
     * que ele organize pelo ID do meu aluno.
     */
    @Override
    public int compare(Estudante a, Estudante b) {
        if(a.getid() > b.getid()) {
            return 1;
        }
        else if(a.getid() < b.getid()){
            return -1;
        }
        return 0;
    }

}
