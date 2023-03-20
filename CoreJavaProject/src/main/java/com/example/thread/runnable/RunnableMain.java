package com.emexo.thread.runnable;

public class RunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        RunnableTask task = new RunnableTask();
        Thread thread1 = new Thread(task);
        thread1.start();

        Thread thread2 = new Thread(task);
        thread2.setPriority(2);
        thread2.setName("New Child Thread");
        thread2.start();

    }
}
