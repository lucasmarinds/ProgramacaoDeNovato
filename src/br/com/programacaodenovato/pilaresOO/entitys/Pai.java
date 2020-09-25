package br.com.programacaodenovato.pilaresOO.entitys;

public class Pai {
    public String nome;
    public Integer idade;
    public char sexo ='M';

    public Pai(String nome,Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pai() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
