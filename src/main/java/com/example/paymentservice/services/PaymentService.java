package com.example.paymentservice.services;


import com.example.paymentservice.PaymentGateway.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService{


    @Autowired
    PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public String initiatePayment(int amount, String phoneNumber,String orderId, String customerName){
     return paymentGatewayChooserStrategy.getPaymentGateway().getPaymentLink(amount, phoneNumber, orderId, customerName);
    }
}

