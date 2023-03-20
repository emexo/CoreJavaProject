package com.emexo.thread.basics;

public class AnonymousThread {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("New Child Thread 1 : " + Thread.currentThread().getName());
        });
        t1.start();

        Thread t2 = new Thread(() -> System.out.println("New Child Thread 2 : " + Thread.currentThread().getName()));
        t2.start();
    }
}
