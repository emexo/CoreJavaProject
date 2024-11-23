package com.emexo.designpattern.abstractfactory;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SmallCar extends Car {
    public SmallCar(Location location)
    {
        super(CarType.SMALL, location);
        construct();
    }

    @Override
    protected void construct() {
        log.info("Luxury Car");
    }
}
