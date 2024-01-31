package com.emexo.constructor;

public class Employee {
    private int employeeId;
    private String employeeName;

    /**
     * Default constructor
     */
    public Employee() {
        this.employeeId = 1;
        this.employeeName = "Regu";
    }

    /**
     * Parameterized constructor
     * @param id
     * @param name
     */
    public Employee(int id, String name) {
        this.employeeId = id;
        this.employeeName = name;
    }

    /**
     * Parameterized constructor
     * @param employeeId
     * @param employeeName
     */
    public Employee(String employeeName, int employeeId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        System.out.println(employee1.employeeId + "  : "+ employee1.employeeName);

        Employee employee2 = new Employee(2, "Ajay");
        System.out.println(employee2.employeeId + "  : "+ employee2.employeeName);

        Employee employee3 = new Employee( "Sanjay", 3);
        System.out.println(employee3.employeeId + "  : "+ employee3.employeeName);
    }
}
