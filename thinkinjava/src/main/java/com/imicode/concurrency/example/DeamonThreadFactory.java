package com.imicode.concurrency.example;

import java.util.concurrent.ThreadFactory;

/**
 * Created by wenyou on 16/8/21.
 */
public class DeamonThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
