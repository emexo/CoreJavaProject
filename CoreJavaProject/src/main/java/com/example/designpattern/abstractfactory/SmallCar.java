package com.example.designpattern.abstractfactory;

public class SmallCar extends Car {
    public SmallCar(Location location)
    {
        super(CarType.SMALL, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("luxury car");
        //add accessories
    }
}


