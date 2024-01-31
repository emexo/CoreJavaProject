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
        employee5.setEmployeeId(19);
        employee5.setEmployeeName("Neha5555");
        employee5.setAddress("BLR555");

        Map<Employee, Integer> employeeMap = new HashMap<>(20, 05.f);

        employeeMap.put(employee1, employee1.getEmployeeId());
        employeeMap.put(employee2, employee2.getEmployeeId());
        employeeMap.put(employee3, employee3.getEmployeeId());
        employeeMap.put(employee4, employee4.getEmployeeId());
        employeeMap.put(employee5, employee5.getEmployeeId());


        employeeMap.get(employee1);

      employeeMap.forEach((key, value)->{
            System.out.println(key + " : "+ value);
        });

// before java 8 - for each
       Set<Map.Entry<Employee, Integer>> employeeSet = employeeMap.entrySet();

       for(Map.Entry<Employee, Integer> entry: employeeSet){
           System.out.println(entry.getKey() + " : "+ entry.getValue());
       }
    }
}
