package com.example.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Bangalore");
        set.add("Mumbai");
        set.add("Chennai");
        set.add("Bangalore");

        //set.forEach(e -> System.out.println(e));

        Employee employee1 = new Employee();
        employee1.setEmployeeName("Regu");
        employee1.setEmployeeId(1);
        employee1.setAddess("Bangalore");

        Employee employee2 = new Employee();
        employee2.setEmployeeName("Anand");
        employee2.setEmployeeId(3);
        employee2.setAddess("Mumbai");

        Employee employee3 = new Employee();
        employee3.setEmployeeName("Santhosh");
        employee3.setEmployeeId(2);
        employee3.setAddess("Chennai");

        Employee employee4 = new Employee();
        employee4.setEmployeeName("Regu");
        employee4.setEmployeeId(1);
        employee4.setAddess("Bangalore");

        Set<Employee> set1 = new TreeSet<>();
        set1.add(employee1);
        set1.add(employee2);
        set1.add(employee3);
        set1.add(employee4);

        set1.forEach(e -> {
            System.out.println(e);
        });


    }
}
