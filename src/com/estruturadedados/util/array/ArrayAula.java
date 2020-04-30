package com.estruturadedados.util.array;

public class ArrayAula {

    private int[] elements;
    private int positionFree;

    public ArrayAula(){
        this.elements = new int[10];
    }

    public void add(int element) {
        if (positionFree < elements.length && positionFree >= 0) {
            this.elements[this.positionFree] = element;
            positionFree++;
        }
    }

    public Object size(){
        return this.positionFree;
    }

    public int getPosition(int position){
        return this.elements[position];
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i< positionFree; i++){
            stringBuilder.append("[");
            stringBuilder.append(elements[i]);
            stringBuilder.append("]");
        }

        return stringBuilder.toString();
    }

}
