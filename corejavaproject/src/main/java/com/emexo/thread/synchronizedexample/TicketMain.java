package com.emexo.thread.synchronizedexample;

public class TicketMain {
    public static void main(String[] args) {

        TicketDAO ticketDAO = new TicketDAO();

        TicketTask ticket1 = new TicketTask(1l, "Bangalore", "Chennai", ticketDAO);
        TicketTask ticket2 = new TicketTask(2l, "Pune", "Bangalore", ticketDAO);

        Thread t1 = new Thread(ticket1);
        t1.start();

        Thread t2 = new Thread(ticket2);
        t2.start();
    }
}
