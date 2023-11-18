package com.emexo.generics.generictype;

public class Box <T>{
    private T input;

    public T getInput() {
        return input;
    }

    public void setInput(T input) {
        this.input = input;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("U: " + u.getClass().getName());
    }
}
