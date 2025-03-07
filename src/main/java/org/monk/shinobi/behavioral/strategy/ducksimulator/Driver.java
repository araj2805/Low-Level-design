package org.monk.shinobi.behavioral.strategy.ducksimulator;

import org.monk.shinobi.behavioral.strategy.ducksimulator.behaviour.Flyable;
import org.monk.shinobi.behavioral.strategy.ducksimulator.behaviour.LongFLy;
import org.monk.shinobi.behavioral.strategy.ducksimulator.behaviour.ShortFly;
import org.monk.shinobi.behavioral.strategy.ducksimulator.client.Duck;
import org.monk.shinobi.behavioral.strategy.ducksimulator.client.RedHeadDuck;

/**
 * Copyright (c) 2024.
 * @author Ankit Raj
 */

public class Driver {
    public static void main(String[] args) {
        Duck duck = new RedHeadDuck(new LongFLy());

        Flyable shortFly = new ShortFly();
        duck.setFlyable(shortFly);

        Flyable longFLy = new LongFLy();
        duck.setFlyable(longFLy);

        duck.performFly();



    }
}
