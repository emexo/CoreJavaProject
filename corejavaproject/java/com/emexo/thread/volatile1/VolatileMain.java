package com.emexo.thread.volatile1;

public class VolatileMain {
    public static void main(String[] args) {
        new Thread ( () -> {
            Employee emp1 = Employee.getInstance();
            System.out.println("EMP1 : " + emp1.hashCode());
        }).start();

        new Thread ( () -> {
            Employee emp2 = Employee.getInstance();
            System.out.println("EMP2 : " + emp2.hashCode());
        }).start();
    }
}
