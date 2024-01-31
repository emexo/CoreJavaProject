package com.emexo.oops.encapsulation;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpId(2);
        employee.setEmpName("Regu");

        System.out.println(employee.getEmpId());
        System.out.println(employee.getEmpName());

        Employee employee2 = new Employee();
        employee2.setEmail("regu@gmail.com");
        employee2.setMobNo(444445l);
    }
}
