package br.com.programacaodenovato.util.arraylists;

import br.com.programacaodenovato.entitys.Produto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAula {
    public static void main(String[] args) {

        ArrayList<Produto> list = new ArrayList(20); // Estou utilizando generics pelo diamante <T> T=Tipo ou Type.
        Produto p1 = new Produto();
        p1.setNome("Paumolive");
        p1.setPreco(5.99);
        list.add(p1);
        Produto p2 = new Produto();
        p2.setPreco(2.00);
        list.add(p2);

        System.out.println(list);
        System.out.println("Tamanho da Lista: "+list.size());

        Produto pegarCaracteristicaProduto = (Produto) list.get(0);

        System.out.println(pegarCaracteristicaProduto.getPreco());
        //list.remove(1);
        System.out.println("Tamanho Atual:"+list.size());

        for(Produto obj: list){
            if(obj.getPreco() < 3.00){
                System.out.println("Da para comprar : "+obj);
            }else{
                System.out.println("N?o da para comprar: "+obj);
            }
        }

        List<Produto> lista = new ArrayList(20);

        for(int i=0; i<21; i++){
            lista.add(new Produto());
        }

        System.out.println(lista.size());
        
        List<Produto> listaligada = new LinkedList<Produto>();

    }
}
