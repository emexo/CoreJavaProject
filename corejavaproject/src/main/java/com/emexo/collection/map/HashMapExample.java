package com.emexo.collection.map;

import java.util.*;

public class HashMapExample {
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
        employee4.setEmployeeId(19);
        employee4.setEmployeeName("Neha");
        employee4.setAddress("BLR");

        Employee employee5 = new Employee();
        employee5.setEmployeeId(24);
        employee5.setEmployeeName("Neha555");
        employee5.setAddress("BLR555");

        Map<Integer, Employee> employeeMap = new Hashtable<>();

        employeeMap.put(employee1.getEmployeeId(), employee1);
        employeeMap.put(employee2.getEmployeeId(), employee2);
        employeeMap.put(employee3.getEmployeeId(), employee3);
        employeeMap.put(employee4.getEmployeeId(), employee4);
        employeeMap.put(4, employee5);

        employeeMap.get(1);

        employeeMap.forEach((key, value)->{
            System.out.println(key + " : "+ value);
        });


    }
}
