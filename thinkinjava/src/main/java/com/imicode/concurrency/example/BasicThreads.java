package com.imicode.concurrency.example;

/**
 * Created by wenyou on 16/8/20.
 */
public class BasicThreads {

    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("waiting for liftoff");
    }
}
