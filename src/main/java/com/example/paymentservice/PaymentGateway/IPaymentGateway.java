package com.example.paymentservice.PaymentGateway;

public interface IPaymentGateway {
     String getPaymentLink(int amount, String phoneNumber,String orderId, String customerName);
}
