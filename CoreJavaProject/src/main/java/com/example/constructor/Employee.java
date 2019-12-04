package com.example.constructor;

public class Employee {

	public int empId;
	public String empName;

	public Employee(){
		System.out.println("Default Constructor");
	}

	public Employee(Integer id, String name) {
		this.empId = id; // single line comment
		this.empName = name;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Gary");
		System.out.println(emp1.empId + " : " + emp1.empName);

		Employee emp2 = new Employee(2, "Natalia");
		System.out.println(emp2.empId + " : " + emp2.empName);

		Employee emp3 = new Employee(3, "Rohan");
		System.out.println(emp3.empId + " : " + emp3.empName);


	}

}
