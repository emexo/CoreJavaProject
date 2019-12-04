package com.coding.multithreading.automic;

import java.util.concurrent.locks.*;

public class Counter2 {
    private int value;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        value++;
        lock.unlock();
    }

    public void decrement() {
        lock.lock();
        value--;
        lock.unlock();
    }

    public synchronized int get() {
        return value;
    }
}
