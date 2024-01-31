package com.emexo.collection.list;


import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employeeList = getEmployees();

        // for each loop
        for(Employee employee: employeeList){
            System.out.println(employee.getEmployeeId() + " : " + employee.getEmployeeName());
        }

        // lambda expression - from java 8
        employeeList.forEach(emp -> System.out.println(emp.getEmployeeId() + " : " + emp.getEmployeeName()));

        // for loop
        for(int i =0; i<employeeList.size(); i++){
            Employee employee = employeeList.get(i);
            System.out.println(employee.getEmployeeId() + " : " + employee.getEmployeeName());
        }
        
        //using iterator
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee.getEmployeeId() + " : " + employee.getEmployeeName());
        }
        
        // using list iterator
        ListIterator<Employee> listIterator = employeeList.listIterator();
        while (listIterator.hasNext()){
            Employee employee = listIterator.next();
            System.out.println(employee.getEmployeeId() + " : " + employee.getEmployeeName());
        }

        while (listIterator.hasPrevious()){
            Employee employee = listIterator.previous();
            System.out.println(employee.getEmployeeId() + " : " + employee.getEmployeeName());
        }
        
    }

    private static List<Employee> getEmployees() {
        Employee employee1 = new Employee();
        employee1.setEmployeeId(1);
        employee1.setEmployeeName("Ajay");

        Employee employee2 = new Employee();
        employee2.setEmployeeId(2);
        employee2.setEmployeeName("Raju");

        Employee employee3 = new Employee();
        employee3.setEmployeeId(3);
        employee3.setEmployeeName("Gary");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        return employeeList;
    }
}
