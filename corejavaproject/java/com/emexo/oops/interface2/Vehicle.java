package com.emexo.oops.interface2;

public interface Vehicle {

    String COMPANY_NAME = "SKODA"; // static

    void engine();  // abstract method - method without body

    public default void getVehicleDetails(){  // default method - method with body
        System.out.println("Vehicle Details");
        privateMethod();
    }

    public static void getVehicleBrand(){  // static method
        System.out.println("skoda");
    }

    private void privateMethod(){
        System.out.println("Private method");
    }
}
