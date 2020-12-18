package com.example.thread.basics;

public class RunnableTask implements  Runnable {

    private  String ipAddress;
    private SharedResource sharedResource;

    public RunnableTask(SharedResource sharedResource, String ipAddress)
    {
        this.sharedResource = sharedResource;
        this.ipAddress = ipAddress;
    }

    @Override
    public void run() {
        System.out.println("New Thread Start: " + Thread.currentThread().getName() + " IPAddress: " + ipAddress);
        sharedResource.sharedMethod();
        System.out.println("New Thread End: " + Thread.currentThread().getName() + " IPAddress: " + ipAddress);

    }

}
