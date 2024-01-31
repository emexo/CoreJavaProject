package com.emexo.serialization;



import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
@Slf4j
public class TestMain {

    public static final String fileName = "/Users/regus/Documents/F/CoreJavaRepo/corejavaproject/src/main/resources/employee.ser";

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ajay");

        TestMain obj = new TestMain();
        obj.serialize(employee);

        Employee employee1 = obj.deserialize();
        log.info("Deserialized Object, emp:{}", employee1);
    }

    public void serialize(Employee employee){
        log.info("Inside the TestMain.serialize, employee:{}", employee);

        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);){

            outputStream.writeObject(employee);
        } catch (Exception ex){
            log.error("Exception while serializing the object", ex);
        }

        log.info("End of TestMain.serialize");
    }

    public Employee deserialize(){
        log.info("Inside the TestMain.deserialize");
        Employee employee = null;

        try(FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);){

            employee = (Employee) inputStream.readObject();
        }catch (Exception ex){
            log.error("Exception while deserializing the object", ex);
        }

        log.info("End of TestMain.deserialize");

        return employee;
    }
}
