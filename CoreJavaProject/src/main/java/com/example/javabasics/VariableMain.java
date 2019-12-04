package com.example.javabasics;

public class VariableMain {


    public static void main(String[] args) {
        System.out.println(Employee.ORGANIZATION_NAME);


        // object creation
        Employee employee = new Employee();
        System.out.println(employee.empId);
        System.out.println(employee.empName);
        int input =10;
        employee.getEmployeeDetails(input);

        Employee employee1 = new Employee(5, "Ajay");
        System.out.println(employee1.empId);
        System.out.println(employee1.empName);


        // invoke static method
        Employee.getOrganizationDetails();

        String response = Employee.getOrganizationDetails1();
        System.out.println(response);




    }
}
