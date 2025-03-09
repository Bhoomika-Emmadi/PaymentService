package com.example.paymentservice.PaymentGateway;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentGateway implements IPaymentGateway{
    @Override
    public String getPaymentLink(int amount, String phoneNumber, String orderId, String customerName) {

        return null;
    }
}
