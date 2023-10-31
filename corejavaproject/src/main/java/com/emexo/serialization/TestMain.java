package com.emexo.serialization;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMain {
    private static final Logger LOGGER = LogManager.getLogger(Employee.class);

    public static final String fileName = "/Users/regus/Documents/F/CoreJavaRepo/corejavaproject/src/main/resources/employee.ser";

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ajay");

        TestMain testMain = new TestMain();
        testMain.serialize(employee);

        Employee employee1 = testMain.deserialize();
        LOGGER.info("Deserialized Object, emp:{}", employee1);
    }

    public void serialize(Employee employee){
        LOGGER.info("Inside the TestMain.serialize, employee:{}", employee);

        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);){

            outputStream.writeObject(employee);
        } catch (Exception ex){
            LOGGER.error("Exception while serializing the object", ex);
        }

        LOGGER.info("End of TestMain.serialize");
    }

    public Employee deserialize(){
        LOGGER.info("Inside the TestMain.deserialize");
        Employee employee = null;

        try(FileInputStream fileOutputStream = new FileInputStream(fileName);
            ObjectInputStream inputStream = new ObjectInputStream(fileOutputStream);){

            employee = (Employee) inputStream.readObject();
        }catch (Exception ex){
            LOGGER.error("Exception while deserializing the object", ex);
        }

        LOGGER.info("End of TestMain.deserialize");

        return employee;
    }
}
