package com.emexo.thread.basics.runnable;

public class DiscoveryMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        DiscoveryTask task1 = new DiscoveryTask();
        Thread thread1 = new Thread(task1);
        thread1.setPriority(10);
        thread1.setName("Discovery Task");
        thread1.start();

    }
}
