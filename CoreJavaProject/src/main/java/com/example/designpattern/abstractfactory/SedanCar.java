package com.example.designpattern.abstractfactory;

public class SedanCar extends Car {
    public SedanCar(Location location)
    {
        super(CarType.SEDAN, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("luxury car");
        //add accessories
    }
}

