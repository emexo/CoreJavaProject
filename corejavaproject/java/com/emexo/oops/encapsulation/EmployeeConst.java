package com.emexo.oops.encapsulation;

public class EmployeeConst {
    private int empId;
    private String empName;

    private long mobNo;
    private String emailId;

    public EmployeeConst(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public EmployeeConst(int empId, String empName, long mobNo, String emailId) {
        this.empId = empId;
        this.empName = empName;
        this.mobNo = mobNo;
        this.emailId = emailId;
    }

    public void getEmpDetails(){
        System.out.println(empId + " : "+ empName);
    }

    public static void main(String[] args) {
        EmployeeConst employee = new EmployeeConst(1, "Regu");
        employee.getEmpDetails();
    }
}
