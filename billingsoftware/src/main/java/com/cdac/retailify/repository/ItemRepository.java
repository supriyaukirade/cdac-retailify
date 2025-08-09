package com.cdac.retailify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.retailify.entity.ItemEntity;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {

    Optional<ItemEntity> findByItemId(String id);

    Integer countByCategoryId(Long id);
}
