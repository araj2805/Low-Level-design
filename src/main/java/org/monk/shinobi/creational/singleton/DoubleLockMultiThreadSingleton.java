package org.monk.shinobi.creational.singleton;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class DoubleLockMultiThreadSingleton {
    private static volatile DoubleLockMultiThreadSingleton instance;
    private String value;

    private DoubleLockMultiThreadSingleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.value = value;
    }

    /*
    * Double Lock Singleton creation
    * */
    public static DoubleLockMultiThreadSingleton getInstance(String value) {

        DoubleLockMultiThreadSingleton result = instance;

        if (result != null)
            return result;

        synchronized (DoubleLockMultiThreadSingleton.class) {
            if (instance == null)
                instance = new DoubleLockMultiThreadSingleton(value);;

            return instance;
        }
    }

    public String getValue() {
        return value;
    }
}

class DCLMultiThreadDriver {
    public static void main(String[] args) {
        // Issue with Multithread

        Thread t1 = new Thread(() -> {
            DoubleLockMultiThreadSingleton th1Instance = DoubleLockMultiThreadSingleton.getInstance("th1Instance");
            System.out.println(th1Instance.getValue());
        });

        Thread t2 = new Thread(() -> {
            DoubleLockMultiThreadSingleton th2Instance = DoubleLockMultiThreadSingleton.getInstance("th2Instance");
            System.out.println(th2Instance.getValue());
        });

        t1.start();
        t2.start();
    }
}


