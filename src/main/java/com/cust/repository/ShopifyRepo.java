package com.cust.repository;

import com.entity.ShopifyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShopifyRepo extends JpaRepository<ShopifyEntity, String> {
}
