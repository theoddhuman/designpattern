package com.subham.designpattern.creational.objectpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

/**
 * @author subham.paul
 *
 * used blocking queue for thread safety
 * ObjectPool is singleton
 */
public class ObjectPool<T extends Poolable> {
    private static volatile ObjectPool<?> INSTANCE = null;
    private BlockingQueue<T> availablePool;
    int count;

    public ObjectPool(int count) {
        availablePool = new ArrayBlockingQueue<>(count);
        this.count = count;
    }

    public static <T extends Poolable> ObjectPool<T> getInstance(int count) {
        if(INSTANCE == null) {
            synchronized (ObjectPool.class) {
                if(INSTANCE == null) {
                    INSTANCE = new ObjectPool<>( count);
                }
            }
        }
        return (ObjectPool<T>) INSTANCE;
    }

    public void load(Supplier<T> creator) throws InterruptedException {
        for (int i=0; i<count; i++) {
            availablePool.put(creator.get());
        }
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
