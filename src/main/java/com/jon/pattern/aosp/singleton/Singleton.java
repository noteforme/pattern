package com.jon.pattern.aosp.singleton;

public abstract class Singleton<T> {
    private T mInstance;

    public final T get() {
        synchronized (this) {
            if (mInstance == null) {
                mInstance = create();
            }
        }
        return mInstance;
    }

    protected abstract T create();
}
