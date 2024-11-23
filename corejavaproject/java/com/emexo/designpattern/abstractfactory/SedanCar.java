package com.emexo.designpattern.abstractfactory;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SedanCar extends Car {
    public SedanCar(Location location)
    {
        super(CarType.SEDAN, location);
        construct();
    }

    @Override
    protected void construct() {
        log.info("Luxury Car");
    }
}
