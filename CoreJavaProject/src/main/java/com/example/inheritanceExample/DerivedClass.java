package com.example.inheritanceExample;

public class DerivedClass extends BaseClass{
	public DerivedClass() {
		super(9);
		System.out.println(noOfDoors);
	}
	
	@Override
	public Integer parentMethod(){
		System.out.println("Child method");
		return null;
	}

}
