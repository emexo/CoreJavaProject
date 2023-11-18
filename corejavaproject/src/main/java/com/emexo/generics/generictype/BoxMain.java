package com.emexo.generics.generictype;

public class BoxMain {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setInput("Bangalore");
        System.out.println(box.getInput());

        Box<Integer> box1 = new Box<>();
        box1.setInput(77);
        System.out.println(box1.getInput());



    }
}
