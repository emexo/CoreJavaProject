package com.emexo.thread.join;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
       Thread childThread1 =  new Thread(()-> {
            try {
                System.out.println(" Start Thread : " + Thread.currentThread().getName());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           System.out.println(" End Thread : " + Thread.currentThread().getName());
        });

       childThread1.start();
       childThread1.join();

        Thread childThread2 =  new Thread(()-> {
            try {
                System.out.println(" Start Thread : " + Thread.currentThread().getName());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" End Thread : " + Thread.currentThread().getName());
        });

        childThread2.start();

        System.out.println(Thread.currentThread().getName());

    }
}
