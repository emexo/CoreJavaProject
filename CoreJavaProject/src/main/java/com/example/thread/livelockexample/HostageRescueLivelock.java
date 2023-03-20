package com.emexo.thread.livelockexample;

public class HostageRescueLivelock {
    static final Police police = new Police();

    static final Criminal criminal = new Criminal();

    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            public void run() {
                police.giveRansom(criminal);
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                criminal.releaseHostage(police);
            }
        });
        t2.start();
    }

}
