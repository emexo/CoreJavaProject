package com.coding.multithreading.lock.readwrite;

import java.util.*;

/**
 * ReadWriteLockTest.java
 * Test program for understanding ReadWriteLock
 * @author www.codejava.net
 */
public class ReadWriteLockTest {
    static final int READER_SIZE = 10;
    static final int WRITER_SIZE = 2;

    public static void main(String[] args) {
        Integer[] initialElements = {33, 28, 86, 99};

        ReadWriteList<Integer> sharedList = new ReadWriteList<>(initialElements);

        for (int i = 0; i < WRITER_SIZE; i++) {
            new Writer(sharedList).start();
        }

        for (int i = 0; i < READER_SIZE; i++) {
            new Reader(sharedList).start();
        }

    }
}
