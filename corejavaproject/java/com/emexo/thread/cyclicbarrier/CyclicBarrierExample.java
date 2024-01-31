package com.emexo.thread.cyclicbarrier;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String args[]) {

        //creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
        final CyclicBarrier cb = new CyclicBarrier(3, () -> {
            //This task will be executed once all thread reaches barrier
            System.out.println("All parties are arrived at barrier, lets play");
        });

        //starting each of thread
        Thread t1 = new Thread(new Task(cb), "Thread 1");
        Thread t2 = new Thread(new Task(cb), "Thread 2");
        Thread t3 = new Thread(new Task(cb), "Thread 3");

        t1.start();
        t2.start();
        t3.start();

        //cb.reset();

    }
}
