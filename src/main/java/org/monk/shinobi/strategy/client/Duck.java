package org.monk.shinobi.strategy.client;

import org.monk.shinobi.strategy.behaviour.Flyable;

/**
 * Copyright (c) 2023.
 * @author Ankit Raj
 */

public abstract class Duck {

    Flyable flyable; // Behaviour HAS A

    public Duck(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void performFly() {
        flyable.fly();
    }

    abstract void display ();


}
