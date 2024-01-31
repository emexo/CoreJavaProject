package com.emexo.thread.blockingqueue;


import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Object> queue = null;

    Producer(BlockingQueue<Object> theQueue) {
        this.queue = theQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Object obj = getResource();
                queue.put(obj);
                System.out.println("Produced Resource - Queue size now : "  + queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Object getResource() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        return new Object();
    }
}
