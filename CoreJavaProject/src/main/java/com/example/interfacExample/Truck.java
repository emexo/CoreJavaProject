package com.example.interfacExample;

public class Truck implements Vechicle {
	public void start() {
		System.out.println("Start method");
	}

	@Override
	public void stop() {
		System.out.println("Stop Method");
	}

}

