package org.monk.shinobi.strategy.paymentStrategy;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class ClientUI {
    public static void main(String[] args) {
        Orders order1 = new Orders();

        order1.setPaymentStratergy(new UpiPaymentStratergy());
        order1.processOrders(100);

        order1.setPaymentStratergy(new CardPaymentStratergy());

        order1.processOrders(50);
    }
}
