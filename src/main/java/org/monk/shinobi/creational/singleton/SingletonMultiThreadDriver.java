package org.monk.shinobi.creational.singleton;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class SingletonMultiThreadDriver {
    public static void main(String[] args) {
        // Issue with Multithread

        Thread t1 = new Thread(() -> {
            BasicSingleton th1Instance = BasicSingleton.getInstance("th1Instance");
            System.out.println(th1Instance.getValue());
        });

        Thread t2 = new Thread(() -> {
            BasicSingleton th2Instance = BasicSingleton.getInstance("th2Instance");
            System.out.println(th2Instance.getValue());
        });

        t1.start();
        t2.start();
    }
}
