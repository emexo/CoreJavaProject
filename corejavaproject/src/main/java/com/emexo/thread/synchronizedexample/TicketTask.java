package com.emexo.thread.synchronizedexample;

public class TicketTask implements Runnable{

    private long ticketId;
    private String from;
    private String to;
    private TicketDAO ticketDAO;

    public TicketTask(long ticketId, String from, String to, TicketDAO ticketDAO) {
        this.ticketId = ticketId;
        this.from = from;
        this.to = to;
        this.ticketDAO = ticketDAO;
    }

    @Override
    public void run() {
        try {
            ticketDAO.saveTicket();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
