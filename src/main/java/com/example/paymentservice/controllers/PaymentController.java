package com.example.paymentservice.controllers;

import com.example.paymentservice.dtos.InitiatePaymentDto;
import com.example.paymentservice.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    IPaymentService paymentService;

    @PostMapping
    public String getPaymentList(@RequestBody InitiatePaymentDto initiatePaymentDto){
        return paymentService.initiatePayment(initiatePaymentDto.getAmount(),
                initiatePaymentDto.getPhoneNumber(),
                initiatePaymentDto.getOrderId(),
                initiatePaymentDto.getCustomerName());
    }


}
