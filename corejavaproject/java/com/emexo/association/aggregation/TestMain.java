package com.emexo.association.aggregation;

public class TestMain {
    public static void main(String[] args) {

        Engine engine = new Engine(8669, "petrol");
        Car car = new Car(2022, "SUV", engine);
        car.getCarDetails();
        car = null;
        System.gc();
    }
}