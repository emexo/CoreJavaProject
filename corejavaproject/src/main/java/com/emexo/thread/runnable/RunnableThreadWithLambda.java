package com.emexo.thread.runnable;

public class RunnableThreadWithLambda {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread thread1 = new Thread(()-> System.out.println(Thread.currentThread().getName()));
        thread1.start();
    }
}
