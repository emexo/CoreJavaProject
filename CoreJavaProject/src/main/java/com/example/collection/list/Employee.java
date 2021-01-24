package com.example.collection.list;

public class Employee implements Comparable<Employee> {
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
    public int compareTo(Employee emp) {
        return emp.employeeId - this.employeeId;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", addess='" + addess + '\'' +
                '}';
    }
}

