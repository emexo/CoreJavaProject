package com.coding.multithreading.lock.readwrite;

import java.util.*;

/**
 * Reader.java
 * This thread randomly adds an element to a shared data structure

 */
public class Reader extends Thread {
    private ReadWriteList<Integer> sharedList;

    public Reader(ReadWriteList<Integer> sharedList) {
        this.sharedList = sharedList;
    }

    public void run() {
        Random random = new Random();
        int index = random.nextInt(sharedList.size());
        Integer number = sharedList.get(index);

        System.out.println(getName() + " -> get: " + number);

        try {
            Thread.sleep(100);
        } catch (InterruptedException ie ) { ie.printStackTrace(); }

    }
}

