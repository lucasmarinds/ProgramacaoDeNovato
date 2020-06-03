package br.com.programacaodenovato.entitys;

import java.beans.Transient;
import java.io.Serializable;

public class Estudante extends Pessoa{

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
}
