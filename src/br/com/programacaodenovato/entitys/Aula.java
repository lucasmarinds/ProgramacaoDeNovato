package br.com.programacaodenovato.entitys;

public class Aula implements Comparable<Aula>{

    private String nomeAula;
    private int minutos;
    private int id;

    public Aula(String nome,int minutos,int identificacaoAula){
        this.nomeAula = nome;
        this.minutos = minutos;
        this.id = identificacaoAula;
    }

    public String getNomeAula() {
        return nomeAula;
    }

    public void setNomeAula(String nomeAula) {
        this.nomeAula = nomeAula;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String toString(){
        return this.nomeAula+" Minutos:"+this.minutos+"ID:"+this.id;
    }

    @Override
    public int compareTo(Aula o) {
        return Integer.compare(this.id,o.id);
    }
}
