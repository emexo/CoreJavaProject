package com.emexo.association.aggregation;

public class Car {
    private int model;
    private String type;
    private Engine engine;

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