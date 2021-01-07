package com.example.inheritanceExample;

public class DerivedClass extends BaseClass{
	public DerivedClass(int i) {
		super(i);
		System.out.println(noOfDoors);
		parentMethod();
	}
	
	@Override
	public Integer parentMethod(){
		System.out.println("Child method");
		return null;
	}

}
