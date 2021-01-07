package com.example.serialization;

import java.io.*;

public class BasicSerializationExample {
    static final String filePath = "C:\\Users\\pc\\Desktop\\SpringProject\\emp.ser";

    static void serialize(Employee emp) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(emp);
            outputStream.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    static Employee deserialize() {
        Employee savedUser = null;

        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            savedUser = (Employee) inputStream.readObject();
            inputStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }

        return savedUser;
    }

    public static void main(String[] args) {


        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setEmpName("Regu");

        serialize(emp);

        Employee res = deserialize();

        System.out.println(res);
    }
}