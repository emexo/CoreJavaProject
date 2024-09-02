package com.emexo.java8.predicate;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private long id;
    private String name;
    private LocalDate dateOfBirth;
    private double salary;

    public Employee(final long id, final String name,
        final LocalDate dateOfBirth, final Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Period.between(LocalDate.now(),dateOfBirth).getYears();
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dateOfBirth="
            + dateOfBirth + ", salary=" + salary + "]";
    }
}