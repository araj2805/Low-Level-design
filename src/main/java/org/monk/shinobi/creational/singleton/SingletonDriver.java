package org.monk.shinobi.creational.singleton;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class SingletonDriver {
    public static void main(String[] args) {
       /*
       If you see the same value, then singleton was reused (yay!)
       If you see different values, then 2 singletons were created (booo!!)
       * */
        BasicSingleton singleton = BasicSingleton.getInstance("foo");
        BasicSingleton newsingleton = BasicSingleton.getInstance("bar");

        System.out.println(singleton.getValue());
        System.out.println(newsingleton.getValue());

    }
}
