package com.emexo.oops.interface2;

public class TestMain {
    public static void main(String[] args) {
         Vehicle petrolCar = new PetrolCar();
         petrolCar.engine();


         Vehicle electricCar = new ElectricCar();
         electricCar.engine();
         electricCar.getVehicleDetails();

        System.out.println(Vehicle.COMPANY_NAME);
        Vehicle.getVehicleBrand();
    }
}
