package com.example.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String args[]) {
        final CountDownLatch latch = new CountDownLatch(3);

        Thread cacheService = new Thread(new Service("CacheService", 1000, latch));
        Thread alertService = new Thread(new Service("AlertService", 1000, latch));
        Thread validationService = new Thread(new Service("ValidationService", 1000, latch));

        cacheService.start();
        alertService.start();
        validationService.start();

        try{
            latch.await();  //main thread is waiting on CountDownLatch to finish
            System.out.println("All services are up, Application is starting now");
        } catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}