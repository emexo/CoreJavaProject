package com.example.interfacExample;

public interface Vechicle {
	
	public int noOfWheels = 4;
	//public static final int noOfWheels = 4;
	
	public void start();
	
	public abstract void stop();

	default void print() {

		System.out.println("print");
}
	
}
