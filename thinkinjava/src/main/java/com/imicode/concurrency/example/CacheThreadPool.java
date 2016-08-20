package com.imicode.concurrency.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wenyou on 16/8/20.
 */
public class CacheThreadPool {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
