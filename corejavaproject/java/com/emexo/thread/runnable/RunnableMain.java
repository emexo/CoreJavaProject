package com.emexo.thread.runnable;

public class RunnableMain {
    public static void main(String[] args) {
        System.out.println("Enter:"+Thread.currentThread().getName());

        Ticket ticket1 = new Ticket("Manoj", "BLR", "TVM");
        Ticket ticket2 = new Ticket("Regu", "NCJ", "BLR");

        Thread t1 = new Thread(ticket1);
        t1.setName("Ticket1");
        t1.setPriority(10);
        t1.start();

        Thread t2 = new Thread(ticket2);
        t2.setName("Ticket2");
        t2.setPriority(4);
        t2.start();

        System.out.println("Exit:"+Thread.currentThread().getState());

    }
}
