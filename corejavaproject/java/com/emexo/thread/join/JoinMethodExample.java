package com.emexo.thread.join;

public class JoinMethodExample {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            System.out.println("Enter: "+ Thread.currentThread().getName());

            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Exit: "+ Thread.currentThread().getName());
        });

        t1.start();
        t1.join();

        Thread t2 = new Thread(() -> {
            System.out.println("Enter: "+ Thread.currentThread().getName());

            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Exit: "+ Thread.currentThread().getName());
        });

        t2.start();
        t2.join();

        Thread t3 = new Thread(() -> {
            System.out.println("Enter: "+ Thread.currentThread().getName());

            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Exit: "+ Thread.currentThread().getName());
        });

        t3.start();
        t3.join();


        System.out.println("Exit: "+ Thread.currentThread().getName());
    }
}
