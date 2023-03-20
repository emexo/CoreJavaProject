package com.emexo.thread.runnable;

public class RunnableTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Priority: "+
                Thread.currentThread().getPriority());
    }
}
