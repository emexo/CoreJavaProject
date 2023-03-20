package com.emexo.thread.basics.lambda;

public class DiscoveryMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread thread1 = new Thread(()-> System.out.println(Thread.currentThread().getName()));
        thread1.start();

        Thread thread2 = new Thread(()-> System.out.println(Thread.currentThread().getName()));
        thread2.start();

        Thread thread3= new Thread(()-> System.out.println(Thread.currentThread().getName()));
        thread3.start();
    }

}
