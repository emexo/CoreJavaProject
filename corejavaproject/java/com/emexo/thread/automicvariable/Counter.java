package com.emexo.thread.automicvariable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private ReentrantLock lock = new ReentrantLock(true);
    int counter = 0;

    public void increment() {
        lock.lock();
        counter++;

    }

    public void decrement() {
        counter--;
    }

    public int get() {
        lock.unlock();
        return counter;
    }
}
