package com.emexo.collection.set;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeId(3);
        employee1.setEmployeeName("Srini");
        employee1.setAddress("UK");

        Employee employee2 = new Employee();
        employee2.setEmployeeId(7);
        employee2.setEmployeeName("Meher");
        employee2.setAddress("AP");

        Employee employee3 = new Employee();
        employee3.setEmployeeId(9);
        employee3.setEmployeeName("Neha");
        employee3.setAddress("BLR");

        Employee employee4 = new Employee();
        employee4.setEmployeeId(9);
        employee4.setEmployeeName("Neha");
        employee4.setAddress("BLR");

        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);


        System.out.println("Size: " +employeeSet.size());


        employeeSet.forEach(employee -> {
            if(!Objects.isNull(employee)) {
                System.out.println(employee.getEmployeeId() + " : " + employee.getEmployeeName() +
                        " : " + employee.getAddress());
            }
        });


    }
}
