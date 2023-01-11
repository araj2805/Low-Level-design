package org.monk.shinobi.strategy.behaviour;

/**
 * Copyright (c) 2023.
 * @author Ankit Raj
 */

public class ShortFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("Performing Short Fly");
    }
}
