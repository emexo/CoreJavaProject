package com.emexo.thread.automicvariable;


public class ThreadsTest {
    static final int NUMBER_THREADS = 100;

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        System.out.println("Initial Counter = " + counter.get());

        UpdateThread[] threads = new UpdateThread[NUMBER_THREADS];

        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i] = new UpdateThread(counter);
            threads[i].start();
        }

        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i].join();
        }

        System.out.println("Final Counter = " + counter.get());
    }
}
