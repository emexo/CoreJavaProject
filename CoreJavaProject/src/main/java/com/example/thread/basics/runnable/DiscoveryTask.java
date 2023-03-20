package com.emexo.thread.basics.runnable;

public class DiscoveryTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
    }
}
