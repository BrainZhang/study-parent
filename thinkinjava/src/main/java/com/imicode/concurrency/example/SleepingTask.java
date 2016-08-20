package com.imicode.concurrency.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wenyou on 16/8/21.
 */
public class SleepingTask extends LiftOff {

    @Override
    public void run() {
        try {
            while (countDown-- > 0) {
                System.out.println(status());
                TimeUnit.MILLISECONDS.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupter");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
