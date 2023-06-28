package com.emexo.composition;

public class Engine {
    private int engineNumber;
    private String engineType;

    public Engine(int engineNumber, String engineType){
        this.engineNumber = engineNumber;
        this.engineType = engineType;
    }

    public void getEngineDetails(){
        System.out.println(engineNumber);
        System.out.println(engineType);
    }

    @Override
    public void finalize() {
        System.out.println("Destroy Engine Object");
    }
}
