package com.example.paymentservice.PaymentGateway;

public interface IPaymentGateway {
     String getPaymentLink(Long amount, String phoneNumber,String orderId, String customerName);
}
