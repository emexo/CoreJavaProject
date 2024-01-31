package com.emexo.thread.forkjoin;


public class AvailableProcessor {
    public static void main(String[] args) {
        int numberOfProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Available Processor :" + numberOfProcessors);
    }
}
