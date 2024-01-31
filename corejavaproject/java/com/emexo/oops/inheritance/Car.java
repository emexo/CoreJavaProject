package com.emexo.oops.inheritance;

public class Car {
    int noDoors;

    public Car(int noDoors) {
        this.noDoors = noDoors;
    }

    public void engine(){
        System.out.println("old Engine");
    }

    public void engine(int model){
        System.out.println("New Engine");
    }

    public Number engine(String model) throws Exception{
        int input = 10;
        return input;
    }
}
