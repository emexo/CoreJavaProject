package com.emexo.serialization;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;

// convert object into byte- serialization
// convert byte into Object - deserialization

public class Employee implements Serializable {
    private static final Logger LOGGER = LogManager.getLogger(Employee.class);

    public static final long serialVersionUID = 788886693750L;

    public static final String ORG_NAME = "JPMC";

    private transient int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void getEmpDetails(){
        LOGGER.info("Employee Id:{}, and Employee Name:{}",employeeId, employeeName );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
