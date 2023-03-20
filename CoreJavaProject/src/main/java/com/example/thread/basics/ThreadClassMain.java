package com.emexo.thread.basics;

public class ThreadClassMain {
    public static void main(String[] args) {
        ThreadClass thread1 = new ThreadClass("10.0.0.0");
        thread1.start();

        ThreadClass thread2 = new ThreadClass("10.0.0.1");
        thread2.start();

    }
}
