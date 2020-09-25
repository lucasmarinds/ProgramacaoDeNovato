package br.com.programacaodenovato.pilaresOO.heranca;

import br.com.programacaodenovato.pilaresOO.entitys.Filho;

public class TesteHerancas {
    public static void main(String[] args) {
        Filho filho = new Filho();
        filho.nome = "Kukre";
        filho.setIdade(19);
        System.out.println(filho.mae.cozinhar());
        System.out.println(filho);
    }
}
