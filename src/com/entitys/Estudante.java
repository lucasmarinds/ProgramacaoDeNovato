package com.entitys;

public class Estudante implements Comparable<Estudante>{

    private String nome;
    private Integer id;
    String email;

    public Estudante(String nome,String email,Integer id){
        this.nome = nome;
        this.email = email;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Integer idNovo){
        this.id = idNovo;
    }

    public int getid(){
        return this.id;
    }

    public String toString(){
        return  this.nome+", "+this.email+", "+this.id;
    }

    @Override
    public int compareTo(Estudante o) {
        return Integer.compare(this.id, o.id);
    }
}
