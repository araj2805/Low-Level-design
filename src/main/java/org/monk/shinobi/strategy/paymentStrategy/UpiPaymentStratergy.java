package org.monk.shinobi.strategy.paymentStrategy;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class UpiPaymentStratergy implements PaymentStratergy{
    @Override
    public void pay(double amount) {
        System.out.println(amount+" Payment done via UPI");
    }
}