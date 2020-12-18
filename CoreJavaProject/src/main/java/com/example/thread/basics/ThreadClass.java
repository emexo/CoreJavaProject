package com.example.thread.basics;

public class ThreadClass extends Thread {
    private  String ipAddress;

    public ThreadClass(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public void run() {
        System.out.println("New Thread : " + Thread.currentThread().getName() + " IPAddress: " + ipAddress);
    }
}
