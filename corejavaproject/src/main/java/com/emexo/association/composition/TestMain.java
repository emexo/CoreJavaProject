package com.emexo.association.composition;

public class TestMain {
    public static void main(String[] args) {

        Car car = new Car(2022, "SUV", 1, "P");
        car.getCarDetails();
        car = null;
        System.gc();
    }
}