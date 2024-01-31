package com.emexo.thread.threadclass;

public class Ticket extends Thread{
    public void run(){
        System.out.println("Enter: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Exit: "+Thread.currentThread().getName());
    }
}
