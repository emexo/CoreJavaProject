package com.emexo.thread.basics;

public class RunnableMain {
    public static void main(String[] args) {
        SharedResource sharedResource1 = new SharedResource();
        Thread thread1 = new Thread(new RunnableTask(sharedResource1, "10.0.0.0"));
        thread1.start();
        thread1.setName("Thread1");

        Thread thread2 = new Thread(new RunnableTask(sharedResource1, "10.0.0.1"));
        thread2.setPriority(1);
        thread2.start();
        thread2.setName("Thread2");
    }
}
