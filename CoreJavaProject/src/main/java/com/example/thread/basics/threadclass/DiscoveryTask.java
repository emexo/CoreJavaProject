package com.emexo.thread.basics.threadclass;

public class DiscoveryTask extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
