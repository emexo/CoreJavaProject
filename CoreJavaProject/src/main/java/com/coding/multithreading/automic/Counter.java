package com.coding.multithreading.automic;
public class Counter {
    private int value;

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public int get() {
        return value;
    }
}
