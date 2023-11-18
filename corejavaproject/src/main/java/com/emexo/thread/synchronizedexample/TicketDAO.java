package com.emexo.thread.synchronizedexample;

public class TicketDAO {

    public synchronized void  saveTicket() throws InterruptedException {
        System.out.println("Enter the saveTicket: "+ Thread.currentThread().getName());

        Thread.yield();

        System.out.println("Exit the saveTicket: "+ Thread.currentThread().getName());
    }

    public void  saveTicket2() throws InterruptedException {
        System.out.println("Enter: "+ Thread.currentThread().getName());

        synchronized (TicketDAO.class) {
            Thread.sleep(6000);
        }

        System.out.println("Enter: "+ Thread.currentThread().getName());
    }
}
