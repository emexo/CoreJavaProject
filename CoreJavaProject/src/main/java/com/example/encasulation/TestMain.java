package com.example.encasulation;

public class TestMain {

	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("regu");
		emp.setAddress("Bangalore");
		
		System.out.println(emp.getAddress());
		
		Employee emp1= new Employee();
		emp1.setId(2);
		emp1.setName("Ashis");
		System.out.println(emp1.getName());
	}

}
