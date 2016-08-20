package com.imicode.concurrency.example;

/**
 * Created by wenyou on 16/8/20.
 */
public class MoreBasicThreads {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("waiting for liftoff!");
    }
}
