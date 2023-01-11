package org.monk.shinobi.strategy;

import org.monk.shinobi.strategy.behaviour.LongFLy;
import org.monk.shinobi.strategy.client.Duck;
import org.monk.shinobi.strategy.client.RedHeadDuck;

public class Driver {
    public static void main(String[] args) {
        Duck duck = new RedHeadDuck(new LongFLy());

        /*Flyable shortFly = new ShortFly();
        duck.setFlyable(shortFly);

        Flyable longFLy = new LongFLy();
        duck.setFlyable(longFLy);*/

        duck.performFly();



    }
}
