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

    /**
     * Default Constructor
     */
    public Employee(){
        System.out.println("Default constructor");
    }

    /**
     * Parameterized
     * @param name
     * @param i
     */
    public Employee(String name, int id){
        this.empId = id;
        this.empName = name;
    }


    public Employee(int id, String name ) {
        this.empId = id;
        this.empName = name;
    }

    /**
     * Instance method example
     * @param i
     * @return
     */
    public int getEmployeeDetails(int i){
        System.out.println(ORGANIZATION_NAME);
        System.out.println(empId);
        return i;
    }

    /**
     * Static method
     */
    public static String getOrganizationDetails(){
        // org details
        String str= "Organization Details";  // org details
        return str;

    }

    public static String getOrganizationDetails1(){
        String str = "JPMC";
        return str;
    }

    public int add(Integer input1, Integer input2){
        int output = input1+ input2;
        return output;
    }

}
