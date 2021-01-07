package com.example.thread.basics;

public class RunnableMain {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();


        Thread thread1 = new Thread(new RunnableTask(sharedResource, "10.0.0.0"));
        thread1.start();

        Thread thread2 = new Thread(new RunnableTask(sharedResource, "10.0.0.1"));
        thread2.setPriority(10);
        thread2.start();
    }
}
