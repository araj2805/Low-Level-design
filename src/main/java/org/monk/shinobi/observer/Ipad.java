package org.monk.shinobi.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class Ipad implements Subject{

    List<Observer> observerList;
    String name = "iPad";
    boolean isAvailable;

    public Ipad(String name) {
        this.name = name;
        this.isAvailable = false;

        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void deregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        observerList.forEach(observer -> observer.update(this.name));
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;

        if (this.isAvailable == true) {
            notifyAllObserver();
        }
    }
}
