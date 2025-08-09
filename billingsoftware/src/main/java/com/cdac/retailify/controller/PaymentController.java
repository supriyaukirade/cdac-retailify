package com.cdac.retailify.controller;

import com.cdac.retailify.io.OrderResponse;
import com.cdac.retailify.io.PaymentRequest;
import com.cdac.retailify.io.PaymentVerificationRequest;
import com.cdac.retailify.io.RazorpayOrderResponse;
import com.cdac.retailify.service.OrderService;
import com.cdac.retailify.service.RazorpayService;
import com.razorpay.RazorpayException;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorpayService razorpayService;
    private final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException {
        return razorpayService.createOrder(request.getAmount(), request.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request) {
        return orderService.verifyPayment(request);
    }
}
