package com.imicode.concurrency.example;

/**
 * Created by wenyou on 16/8/20.
 */
public class MainThread {

    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
