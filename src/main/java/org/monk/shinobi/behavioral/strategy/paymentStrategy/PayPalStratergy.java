package org.monk.shinobi.behavioral.strategy.paymentStrategy;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class PayPalStratergy implements PaymentStratergy{
    @Override
    public void pay(double amount) {
        System.out.println(amount + " Payment done via Paypal");
    }
}
