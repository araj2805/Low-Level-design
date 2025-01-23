package org.monk.shinobi.behavioral.strategy.paymentStrategy;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class Orders {
    private PaymentStratergy paymentStratergy;

    public Orders() {

    }
    public Orders(PaymentStratergy paymentStratergy) {
        this.paymentStratergy = paymentStratergy;
    }

    public void setPaymentStratergy(PaymentStratergy paymentStratergy) {
        this.paymentStratergy = paymentStratergy;
    }

    public void processOrders(double amount) {
        performPayment(amount);
    }

    private void performPayment(double amount) {
        paymentStratergy.pay(amount);
    }
}
