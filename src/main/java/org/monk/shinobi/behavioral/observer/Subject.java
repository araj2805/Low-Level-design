package org.monk.shinobi.behavioral.observer;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public interface Subject {
    public void registerObserver(Observer observer);
    public void deregisterObserver(Observer observer);
    public void notifyAllObserver();
}
