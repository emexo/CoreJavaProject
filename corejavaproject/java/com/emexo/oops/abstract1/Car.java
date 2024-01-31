package com.emexo.oops.abstract1;

public abstract class Car {
    public int noOfDoors;

    public Car(int door){
        this.noOfDoors = door;
    }

    public abstract void engine();

    public void gearBox(){
        System.out.println("Manual Gear box");
    }
}
