package com.emexo.thread.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    Semaphore semaphore = new Semaphore(3);

    public static void main(String args[]) {
        final SemaphoreExample test = new SemaphoreExample();
        new Thread(() -> test.mutualExclusion()).start();
        new Thread(() -> test.mutualExclusion()).start();
        new Thread(() -> test.mutualExclusion()).start();
        new Thread(() -> test.mutualExclusion()).start();
        new Thread(() -> test.mutualExclusion()).start();
        new Thread(() -> test.mutualExclusion()).start();
    }
    private void mutualExclusion() {
        try {
            semaphore.acquire();
            //mutual exclusive region
            System.out.println(Thread.currentThread().getName() + " inside mutual exclusive region");
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " outside of mutual exclusive region");
        }
    }
}
