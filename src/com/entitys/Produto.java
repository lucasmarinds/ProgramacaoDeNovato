package com.entitys;

public class Produto {
    double preco;
    String nome;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Nome: "+getNome()+"/ Preço: "+getPreco();
    }
}
