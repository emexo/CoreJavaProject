package com.emexo.thread.automicvariable;


public class UpdateThread extends Thread {
    private Counter counter;

    public UpdateThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) { ex.printStackTrace(); }

        counter.increment();
    }
}
