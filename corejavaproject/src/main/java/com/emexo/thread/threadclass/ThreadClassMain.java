package com.emexo.thread.threadclass;

public class ThreadClassMain {
    public static void main(String[] args) {

        Ticket thread1 = new Ticket();
        thread1.start();

        Ticket thread2 = new Ticket();
        thread2.start();
    }
}
