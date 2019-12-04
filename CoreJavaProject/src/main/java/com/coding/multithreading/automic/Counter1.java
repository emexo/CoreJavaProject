package com.coding.multithreading.automic;

public class Counter1 {
    private int value;

    public synchronized void increment() {
        value++;
    }

    public synchronized void decrement() {
        value--;
    }

    public synchronized int get() {
        return value;
    }
}
