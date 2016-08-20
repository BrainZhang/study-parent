package com.imicode.concurrency.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wenyou on 16/8/21.
 */
public class DaemonFromFactory implements Runnable {

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

    public static void main(String[] args) throws  Exception {
        ExecutorService exec = Executors.newCachedThreadPool(new DeamonThreadFactory());
        for (int i = 0; i < 10; i++) {
            exec.execute(new DaemonFromFactory());
        }
        System.out.println("All daemon started.");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
