package com.example.paymentservice.PaymentGateway;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {

    @Autowired
    RazorpayPaymentGateway razorpayPaymentGateway;
    @Autowired
    StripePaymentGateway stripePaymentGateway;

    public IPaymentGateway getPaymentGateway() {
        return razorpayPaymentGateway;
    }
}
