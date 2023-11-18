package com.emexo.collection.map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@ToString
@Getter
@Setter
public class Employee /*implements Comparable<Employee>*/ {
    private int employeeId;
    private String employeeName;
    private String address;

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        Employee e = (Employee) o;
        return (this.getEmployeeId()==(e.getEmployeeId()));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getEmployeeId();
        return result;
    }


   /* @Override
    public int compareTo(Employee emp) {
        //return this.getEmployeeName().compareTo(emp.getEmployeeName());
        return this.getEmployeeId() - emp.getEmployeeId();
    }*/
}
