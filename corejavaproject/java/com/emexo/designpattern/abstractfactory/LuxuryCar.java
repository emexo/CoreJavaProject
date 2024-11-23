package com.emexo.designpattern.abstractfactory;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LuxuryCar extends Car {
    public LuxuryCar(Location location)
    {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        log.info("Luxury Car");
    }
}
