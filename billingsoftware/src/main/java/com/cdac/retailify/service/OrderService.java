package com.cdac.retailify.service;

import org.springframework.data.domain.Pageable;

import com.cdac.retailify.io.OrderRequest;
import com.cdac.retailify.io.OrderResponse;
import com.cdac.retailify.io.PaymentVerificationRequest;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();
}
