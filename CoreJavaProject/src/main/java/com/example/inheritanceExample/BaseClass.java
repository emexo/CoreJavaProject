package com.example.inheritanceExample;

public class BaseClass {
	public static final int noOfWheels = 4;
	public static final int noOfDoors = 4;
	
	public BaseClass(){
		this(8);
		System.out.println("Parent Class default constructor");
	}
	
	public BaseClass(int i){
		System.out.println("Parent Class int constructor "  +i);
	}

	public BaseClass(float i){
		System.out.println("Parent Class float constructor "  +i);
	}
	
	public Number parentMethod(){
		System.out.println("Parent method");
		return null;
	}
	
	public void parentMethod(int j){
		System.out.println("Parent method with argument");
	}

	public int parentMethod(float j){
		System.out.println("Parent method with argument");
		return 8;
	}


}
