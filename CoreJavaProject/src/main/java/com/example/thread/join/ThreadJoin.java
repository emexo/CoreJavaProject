package com.example.thread.join;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
       Thread childThread =  new Thread(()-> {
            try {
                System.out.println(" Start Thread : " + Thread.currentThread().getName());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           System.out.println(" End Thread : " + Thread.currentThread().getName());
        });

        childThread.start();
        childThread.join();

        System.out.println("Main Thread: " + Thread.currentThread().getName());
    }
}
