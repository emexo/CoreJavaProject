package com.emexo.java12;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {
    private Integer id;
    private Integer salary;
    private String name;

    public Employee(Integer id,  String name, Integer salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
}
