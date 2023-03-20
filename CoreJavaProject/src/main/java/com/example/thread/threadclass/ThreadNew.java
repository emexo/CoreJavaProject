package com.emexo.thread.threadclass;

public class ThreadNew extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
