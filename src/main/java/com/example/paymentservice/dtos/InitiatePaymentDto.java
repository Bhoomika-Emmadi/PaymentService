package com.example.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDto {
    private int amount;
    private String phoneNumber;
    private String orderId;
    private String customerName;

    public int getAmount() {
        return amount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }
}
