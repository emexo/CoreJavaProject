package com.emexo.thread.runnable;

public class Ticket implements Runnable{

    private String customerName;
    private String from;

    private String to;

    public Ticket(String customerName, String from, String to) {
        this.customerName = customerName;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        System.out.println("Enter the Thread:"+ Thread.currentThread().getName());
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        issueTicket();
        System.out.println("Exit the Thread:"+ Thread.currentThread().getName());
    }

    public void issueTicket(){
        System.out.println(customerName +":"+from+":"+to);
    }
}
