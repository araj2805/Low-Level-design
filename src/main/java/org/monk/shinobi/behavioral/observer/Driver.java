package org.monk.shinobi.behavioral.observer;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class Driver {
    public static void main(String[] args) {
        Ipad ipad = new Ipad("iPad");

        Observer email = new EmailNotification(ipad);
        Observer whatsapp = new WhatsappNotification(ipad);


        System.out.println("Setting up stock for Ipad....");
        ipad.setAvailable(true);


    }
}
