package org.monk.shinobi.behavioral.strategy.ducksimulator.client;

import org.monk.shinobi.behavioral.strategy.ducksimulator.behaviour.Flyable;

/**
 * Copyright (c) 2023.
 * @author Ankit Raj
 */

public class RedHeadDuck extends Duck{

    public RedHeadDuck(Flyable flyable) {
        super(flyable);
    }

    @Override
    void display() {
        System.out.println("Hi I am Red Head Duck!!!");
    }
}
