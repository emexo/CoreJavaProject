package com.emexo.thread.executor;

import java.util.concurrent.Callable;

public class TicketTask implements Callable<String> {

    private int ticketId;
    private int ticketFare;

    public TicketTask(int ticketId, int ticketFare) {
        this.ticketId = ticketId;
        this.ticketFare = ticketFare;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Start: "+Thread.currentThread().getName());

        Thread.sleep(6000);
        System.out.println("End: "+Thread.currentThread().getName());
        return ticketId+":"+ticketFare;
    }
}
