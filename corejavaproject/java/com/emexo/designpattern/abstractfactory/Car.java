package com.emexo.designpattern.abstractfactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class Car {
    private CarType model;
    private Location location;

    public Car(CarType model, Location location){
        this.model = model;
        this.location = location;
    }

    protected abstract void construct();
}
