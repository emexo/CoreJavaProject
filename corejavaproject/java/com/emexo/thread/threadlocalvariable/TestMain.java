package com.emexo.thread.threadlocalvariable;


public class TestMain {
    public static void main(String[] args) {
        DemoTask demoTask = new DemoTask();

        Thread thread1 = new Thread(demoTask);
        thread1.start();

        Thread thread2 = new Thread(demoTask);
        thread2.start();

        Thread thread3 = new Thread(demoTask);
        thread3.start();

        Thread thread4 = new Thread(demoTask);
        thread4.start();
    }
}
