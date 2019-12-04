package com.example.interfacExample;

public class TestMain {

	public static void main(String[] args) {
		Vechicle v = new SmallCar();
		v.start();
		v.print(); //calling default method
		System.out.println(SmallCar.noOfWheels); // calling static variable
	}

}
