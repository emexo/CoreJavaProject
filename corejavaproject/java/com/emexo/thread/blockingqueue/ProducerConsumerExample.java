package com.emexo.thread.blockingqueue;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Object> queue = new LinkedBlockingQueue<>(5);
        int numProducer = 10;
        int numConsumer = 4;

        for (int i=0; i<numProducer; i++) {
            new Thread(new Producer(queue)).start();;
        }

        for (int j=0; j<numConsumer; j++) {
            new Thread(new Consumer(queue)).start();
        }

        //Thread.sleep(10*100);
        //System.exit(0);
    }
}