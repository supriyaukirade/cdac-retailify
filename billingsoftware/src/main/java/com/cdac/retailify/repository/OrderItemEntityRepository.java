package com.cdac.retailify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.retailify.entity.OrderItemEntity;

public interface OrderItemEntityRepository extends JpaRepository<OrderItemEntity, Long> {
}
