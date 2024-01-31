package com.emexo.predicate;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Predicate is essentially a boolean-valued function that takes an input and returns true or false
 */

public class TestPredicate {

    public static void main(String[] args) {
        Predicate<Employee> isAdult = e -> e.getAge() > 18;
        Predicate<Employee> isMale = p -> p.getName().equalsIgnoreCase("M");
        Predicate<Employee> isAdultAndMale = isAdult.and(isMale);
        Predicate<Employee> isAdultOrMale = isAdult.or(isMale);
        Predicate<Employee> isMinor = isAdult.negate();

        BiPredicate<Integer, String> isAdultMale = (p1, p2) -> p1 > 18 && p2.equalsIgnoreCase("M");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Regu", LocalDate.now(), 1000.0));
        employeeList.add(new Employee(2, "Ajay", LocalDate.now(), 1000.0));
        employeeList.add(new Employee(3, "Manju", LocalDate.now(), 1000.0));
        employeeList.add(new Employee(3, "Manoj", LocalDate.now(), 1000.0));

        List<Employee> maleEmployeeList = employeeList.stream().filter(isAdultAndMale).toList();


        List<Employee> adultMalesList = employeeList.stream()
                .filter(x -> isAdultMale.test(x.getAge(), x.getName()))
                .toList();
    }

}