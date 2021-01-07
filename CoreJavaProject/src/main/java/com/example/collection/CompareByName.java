package com.example.collection;

import java.util.Comparator;

public class CompareByName implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {

        return emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
    }
}
