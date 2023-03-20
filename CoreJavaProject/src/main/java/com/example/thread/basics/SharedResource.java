package com.emexo.thread.basics;

public class SharedResource  {

    public synchronized void  sharedMethod(String ipAddress) {
        System.out.println("Shared Resource Start : " + Thread.currentThread().getName() +" and "+ ipAddress);
        try {
            wait(6000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Shared Resource End : " + Thread.currentThread().getName());
    }

    public  void  sharedMethod1() {
        System.out.println("Shared Resource Start : " + Thread.currentThread().getName());
        synchronized(SharedResource.class) {  //synchronized block
            try {
                Thread.sleep(60000);
                //wait(30000);
                //Thread.yield();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Shared Resource End : " + Thread.currentThread().getName());
    }
}
