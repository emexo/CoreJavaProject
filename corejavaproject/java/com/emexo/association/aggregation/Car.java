package com.emexo.association.aggregation;

public class Car {
    private int model;
    private String type;
    private Engine engine;

    public Car(int model, String type, Engine engine) {
        this.model = model;
        this.type = type;
        this.engine = engine;
    }

    public void getCarDetails(){
        System.out.println(model);
        System.out.println(type);
        engine.getEngineDetails();
    }
}