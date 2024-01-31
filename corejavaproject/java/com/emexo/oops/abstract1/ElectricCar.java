package com.emexo.oops.abstract1;

public class ElectricCar extends Car{
    public ElectricCar(int door) {
        super(door);
    }

    @Override
    public void engine() {
        System.out.println("Electric Engine");
    }


}
