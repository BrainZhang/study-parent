package com.imicode.concurrency.example;

import java.util.concurrent.TimeUnit;

/**
 * Created by wenyou on 16/8/21.
 */
public class SimpleDaemons implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.println("sleep() interrupter");
        }

    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new SimpleDaemons());
            t.setDaemon(true);
            t.start();
        }
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
