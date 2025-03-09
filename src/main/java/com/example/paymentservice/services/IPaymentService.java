package com.example.paymentservice.services;

public interface IPaymentService {
    String initiatePayment(int amount, String phoneNumber,String orderId, String customerName);
}
