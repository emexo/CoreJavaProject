package com.emexo.varargs;

public class VarargsExample {
    public static void display(String... values){
        System.out.println("display method invoked ");

        String[] arr = values;
    }

    public static void main(String args[]){
        display();//zero argument
        display("my","name","is","varargs");//four arguments
    }
}
