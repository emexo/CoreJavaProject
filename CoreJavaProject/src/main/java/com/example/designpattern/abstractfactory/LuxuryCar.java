package com.example.designpattern.abstractfactory;

public class LuxuryCar extends Car
{
    public LuxuryCar(Location location)
    {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("luxury car");
        //add accessories
    }
}
