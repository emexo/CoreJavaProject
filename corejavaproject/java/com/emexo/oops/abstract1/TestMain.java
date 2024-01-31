package com.emexo.oops.abstract1;

public class TestMain {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar(4);
        electricCar.engine();
        System.out.println(electricCar.noOfDoors);
        electricCar.gearBox();
    }
}
