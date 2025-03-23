package com.example.paymentservice.services;

public interface IPaymentService {
    String initiatePayment(Long amount, String phoneNumber,String orderId, String customerName);
}
