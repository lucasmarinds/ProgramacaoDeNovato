package br.com.programacaodenovato.entitys;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Estudante extends Pessoa implements Comparable {

    /**
     * Quando a gente faz a serialização de uma classe automaticamente o java gera essa identificação para nossa classe
     * se a gente não deixar esse valor do nosso jeito, automaticamente será gerado pelo java, usamos o
     * serialVersionUID para administrar a versão da classe.
     */
    private static final long serialVersionUID = -7811938843091804184L;

    /**
     * se eu uso essa palavra chave TRANSIENT, na hora de ser feita a gravação no objeto este atributo fica nullo,
     * logo podendo retirar dele a interface serializabe, mas se eu quiser que ele fique gravado junto com objeto
     * estudante no caso, ele necessita ter a interface implementada nele também. pode ser testado sem e com essa
     * wordkey na classe TesteSerializacaoComHeranca dentro do package io.serializacao;
     */
    public transient ContaCorrente contaAluno;
    Pessoa estudante;
    String email;
    int id;

    public Estudante(){};

    public Estudante(String nome, String email,int identidade){
        this.nome = nome;
        this.email = email;
        this.id = identidade;
    }

    public ContaCorrente getContaAluno() {
        return contaAluno;
    }

    public void setContaAluno(ContaCorrente contaAluno) {
        this.contaAluno = contaAluno;
    }

    public Pessoa getEstudante() {
        return estudante;
    }

    public void setEstudante(Pessoa estudante) {
        this.estudante = estudante;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int identidade){
        this.id = identidade;
    }

    public int getId(){
        return this.id;
    }



    /**
     *Se está como override é porque você está vindo da classe Object, se não for você pode criar o seu proprio equals.
     *
     */
    @Override
    public boolean equals(Object objeto) {
        Estudante estudante = (Estudante) objeto;
        if(this.nome == estudante.nome){
            return true;
        }
        return false;
    }

    /**
     * Com o hashCode definido, a tabela de espalhamento por dentro do HashSet vai espalhar os elementos dentro do conjunto
     * apartir do primeiro caracter que tem na String, porém pode ser um defeito quando se trata de varios Objetos que contem
     * a primeira letra, fazendo com que dificulte a busca pelo mesmo objeto dentro conjunto evitando colisões que seria
     * fazer a tabela perder mais tempo procurando por um objeto dentro do conjunto, logo é mais facil utilizar alguma
     * maneira que separe os elementos dentro do conjunto com mais facilidade para serem buscados pela tabela de espalhamento
     * pelo método .contains() do HashSet, neste caso de vez de guardamos apenas a primeira letra do nome, podemos utilizar
     * do HashCode da propria classe String, que já separa da maneira mais separadamente possivel.
     */
    @Override
    public int hashCode() {
        //return this.nome.charAt(0);
        return this.nome.hashCode();
    }

    public String toString(){
        return this.nome+" "+this.email+" "+this.id;
    }

    @Override
    public int compareTo(Object obj) {
        Estudante estudante = (Estudante) obj;
        return Integer.compare(this.id,estudante.id);
    }
}
