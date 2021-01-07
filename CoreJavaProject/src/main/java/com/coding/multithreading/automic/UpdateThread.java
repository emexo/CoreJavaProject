package com.coding.multithreading.automic;

public class UpdateThread extends Thread {
    private Counter2 counter;

    public UpdateThread(Counter2 counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) { ex.printStackTrace(); }

        counter.increment();
    }
}
