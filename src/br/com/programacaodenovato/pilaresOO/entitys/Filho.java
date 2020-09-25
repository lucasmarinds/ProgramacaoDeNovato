package br.com.programacaodenovato.pilaresOO.entitys;

public class Filho extends Pai{

    public Mae mae = new Mae();

    public Filho(){ }

    //veja que este construtor existe na classmaster(pai) então logo quem extende do PAI é obrigado a ter o mesmo Construtor.
    public Filho(String nome, Integer idade) {
        super(nome, idade);
    }

    public String toString(){
        return this.nome+" "+this.idade;
    }


}
