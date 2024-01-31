package com.emexo.thread.starvation;


/**
 * Starvation describes a situation
 * where a greedy thread holds a resource for a long time so other threads are blocked forever.
 */
public class StarvationExample {

    public static void main(String[] args) {
        Worker worker = new Worker();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    worker.work();
                }
            }).start();
        }
    }
}

