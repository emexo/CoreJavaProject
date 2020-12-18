package com.example.thread.basics;

public class SharedResource {


    public synchronized void  sharedMethod() {
        System.out.println("Shared Resource Start : " + Thread.currentThread().getName());
        try {
            //Thread.sleep(30000);
            wait(30000);
            //Thread.yield();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Shared Resource End : " + Thread.currentThread().getName());
    }

    public  void  sharedMethod1() {
        System.out.println("Shared Resource Start : " + Thread.currentThread().getName());
        synchronized(SharedResource.class) {
            try {
                //Thread.sleep(30000);
                wait(30000);
                //Thread.yield();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Shared Resource End : " + Thread.currentThread().getName());
    }
}
