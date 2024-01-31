package com.emexo.collection.set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee implements Comparable<Employee> {
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

    @Override
    public int compareTo(Employee emp) {
        return emp.getEmployeeName().compareTo(this.getEmployeeName());
        //return emp.getEmployeeId() - this.getEmployeeId();
    }
}
