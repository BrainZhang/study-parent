package com.imicode.concurrency.example;

/**
 * Created by wenyou on 16/8/21.
 */
public abstract class IntGenerator {

    private volatile boolean cancel = false;

    public abstract int next();

    public void cancel() {
        this.cancel = true;
    }

    public boolean isCancel() {
        return cancel;
    }
}
