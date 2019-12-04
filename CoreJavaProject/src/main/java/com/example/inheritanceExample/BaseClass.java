package com.example.inheritanceExample;

public class BaseClass {
	public static final int noOfWheels = 4;
	public static final int noOfDoors = 4;
	
	public BaseClass(){
		this(8);
		System.out.println("Parent Class constructor");
	}
	
	public BaseClass(int i){
		System.out.println("Parent Class constructor "  +i);
	}
	
	public Number parentMethod(){
		System.out.println("Parent mathod");
		return null;
	}
	
	public void parentMethod(int j){
		System.out.println("Parent mathod with argument");
	}

	public int parentMethod(float j){
		System.out.println("Parent mathod with argument");
		return 8;
	}


}
