package com.example.thread.executor;

import java.util.concurrent.Callable;

public class Discovery  implements Callable<String> {
    String ipAddress;

    public Discovery(String ipAddress){
        this.ipAddress = ipAddress;
    }

    @Override
    public String call() {
        System.out.println("Input for Runnable task: " + ipAddress + " : " + Thread.currentThread().getName() + " Start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // logic for discovery
        System.out.println("Input for Runnable task: " + ipAddress + " : " + Thread.currentThread().getName() +  " End");
        return ipAddress;
    }
}
