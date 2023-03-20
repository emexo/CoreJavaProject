package com.emexo.thread.basics;

public class ThreadClass extends Thread {
    private  String ipAddress;

    public ThreadClass(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public void run() {
        System.out.println("Enter the run metrhod : " + Thread.currentThread().getName());
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("New Thread : " + Thread.currentThread().getName() + " IPAddress: " + ipAddress);
    }


}
