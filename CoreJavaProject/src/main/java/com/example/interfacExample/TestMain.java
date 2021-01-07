package com.example.interfacExample;

public class TestMain {

	public static void main(String[] args) {
		Vechicle v = new SmallCar();
		v.start();
		v.stop();
		v.print(); //calling default method
		System.out.println(Vechicle.noOfWheels); // calling static variable
	}

}
