package com.emexo.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class  CountDownLatchDemo {
    public static void main(String args[]) {
        final CountDownLatch latch = new CountDownLatch(5); //2

        Thread cacheService = new Thread(new Service("CacheService", 30000, latch));
        Thread alertService = new Thread(new Service("AlertService", 30000, latch));
        Thread validationService = new Thread(new Service("ValidationService", 30000, latch));

        cacheService.start();
        alertService.start();
        validationService.start();

        try{
            latch.await(1, TimeUnit.MINUTES);  //main thread is waiting on CountDownLatch to finish
            System.out.println("All services are up, Application is starting now");
        } catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}