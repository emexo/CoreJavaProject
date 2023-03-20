package com.emexo.thread.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    Semaphore binary = new Semaphore(2, true);
    public static void main(String args[]) {
        final SemaphoreTest test = new SemaphoreTest();
        new Thread(() -> test.mutualExclusion()).start();
        new Thread(() -> test.mutualExclusion()).start();
        new Thread(() -> test.mutualExclusion()).start();
    }
    private void mutualExclusion() {
        try {
            binary.acquire();
            //mutual exclusive region
            System.out.println(Thread.currentThread().getName() + " inside mutual exclusive region");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            binary.release();
            System.out.println(Thread.currentThread().getName() + " outside of mutual exclusive region");
        }
    }
}
