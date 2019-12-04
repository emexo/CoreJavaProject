package com.example.collection;

public class Employee implements Comparable {
    private int employeeId;
    private String employeeName;
    private String addess;

    public Employee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddess() {
        return addess;
    }
    public void setAddess(String addess) {
        this.addess = addess;
    }
    @Override
    public int compareTo(Object obj) {
        Employee emp = (Employee) obj;
        return this.employeeId - emp.employeeId;
    }

}

