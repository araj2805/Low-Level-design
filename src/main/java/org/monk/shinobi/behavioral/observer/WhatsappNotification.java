package org.monk.shinobi.behavioral.observer;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class WhatsappNotification implements Observer{
    private Subject subject;
    String prodName;

    public WhatsappNotification(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String productName) {
        this.prodName = productName;

        System.out.println("Whatsapp Notification for product : "+productName);
    }

}
