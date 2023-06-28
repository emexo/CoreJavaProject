package com.emexo.composition;

public class TestMain {
    public static void main(String[] args) {
        Car car = new Car(2022, "SUV", 1002, "Petrol");
        car.getCarDetails();
        car = null;
        System.gc();
    }
}
