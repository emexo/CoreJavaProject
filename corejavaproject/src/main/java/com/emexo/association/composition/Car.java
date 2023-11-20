package com.emexo.association.composition;

public class Car {
    private int model;
    private String type;
    private final Engine engine;

    public Car(int model, String type, int engineNumber, String engineType) {
        this.model = model;
        this.type = type;
        this.engine = new Engine(engineNumber,engineType);
    }

    public void getCarDetails(){
        System.out.println(model);
        System.out.println(type);
        engine.getEngineDetails();
    }
}