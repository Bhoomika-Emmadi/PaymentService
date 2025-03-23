package com.example.paymentservice.PaymentGateway;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {

    @Autowired
    RazorpayPaymentGateway razorpayPaymentGateway;
    @Autowired
    StripePaymentGateway stripePaymentGateway;
    int count=0;

    public IPaymentGateway getPaymentGateway() {
        count++;
        if(count %2 == 0){
            return stripePaymentGateway;
        }
        return razorpayPaymentGateway;
    }
}
