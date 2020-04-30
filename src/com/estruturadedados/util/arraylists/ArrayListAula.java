package com.estruturadedados.util.arraylists;

import com.entitys.Produto;

import java.util.ArrayList;

public class ArrayListAula {
    public static void main(String[] args) {

        ArrayList<Produto> list = new ArrayList(); // Estou utilizando generics pelo diamante <T> T > Tipo ou Type.
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
                System.out.println("Não da para comprar: "+obj);
            }
        }

    }
}
