package org.monk.shinobi.creational.singleton;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class BasicSingleton {
    private static BasicSingleton instance = null;
    private String value;

    private BasicSingleton(String value) {

        // Just to make result dealy
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.value = value;
    }

    public static BasicSingleton getInstance(String value) {
        if (instance == null)
            instance = new BasicSingleton(value);

        return instance;
    }

    public String getValue() {
        return value;
    }
}
