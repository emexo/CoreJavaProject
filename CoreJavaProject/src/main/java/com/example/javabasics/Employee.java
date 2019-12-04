package com.example.javabasics;

/**
 * Variable example
 *
 */
public class Employee {

    // static variable
    public static final String ORGANIZATION_NAME = "Intel";

    // instance variable
    public int empId;
    public String empName;


    public Employee(){
        System.out.println("Default constructor");
    }

    public Employee(String name, int i){
        System.out.println("Default constructor");
    }


    public Employee(int id, String name ) {
        this.empId = id;
        this.empName = name;
    }

    /**
     * Instance Method
     */
    public int getEmployeeDetails(Integer i){
        // local variable
        int i1= 10;
        System.out.println(i);
        return i;
    }

    /**
     * Static method
     */
    public static String getOrganizationDetails(){
        String str= "Organization Details";
        return str;

    }

    public static String getOrganizationDetails1(){
        String str = "JPMC";

        return str;
    }

}
