package com.emexo.oops.abstract1;

public class PetrolCar extends Car{
    public PetrolCar(int door) {
        super(door);
    }

    @Override
    public void engine() {
        System.out.println("Petrol Engine");
    }


}
