package com.example.collection;
import  java.util.*;

public class ComparableExample {
    public ComparableExample() {
    }

    public static void main(String[] args) {
        ComparableExample comparable = new ComparableExample();

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

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        // before java1.8
        //Collections.sort(list, new CompareByName());

        // from java 1.8
        // sort by employee id
        list.sort(Comparator.comparing(e -> e.getEmployeeId()));
        System.out.println("Sort Employee by employee id");

       /* list.forEach(emp -> System.out.println("Emp Id : " + emp.getEmployeeId() + " " +
                "Emp Name : " + emp.getEmployeeName() + " " +
                "Emp Addredd : " + emp.getAddess()));*/

        // sort by employee name
        list.sort(Comparator.comparing(e -> e.getEmployeeName()));
        System.out.println("Sort Employee by employee name");

        list.forEach(emp -> System.out.println("Emp Id : " + emp.getEmployeeId() + " " +
                "Emp Name : " + emp.getEmployeeName() + " " +
                "Emp Addredd : " + emp.getAddess()));
    }
}
