package org.monk.shinobi.behavioral.observer;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class EmailNotification implements Observer{
    private Subject subject;
    String prodName;

    public EmailNotification(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String productName) {
        this.prodName = productName;

        System.out.println("Email Notification for product : "+productName);
    }

}
