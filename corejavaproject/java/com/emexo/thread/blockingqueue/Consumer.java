package com.emexo.thread.blockingqueue;


import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Object> queue = null;

    public Consumer(BlockingQueue<Object> theQueue) {
        this.queue = theQueue;
    }

    @Override
    public void run() {
        try {
            Object obj = queue.take();
            System.out.println("Consumed Object - Queue size now : " +  queue.size());
            take(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void take(Object obj) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Consumed Resource : " + obj);
    }

}
