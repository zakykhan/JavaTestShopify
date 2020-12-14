package com.cust.controller;

import com.cust.service.ShopifyService;
import com.entity.ShopifyEntity;
import org.hibernate.mapping.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopifyController {

    private final ShopifyService shopifyService;

    public ShopifyController(ShopifyService shopifyService) {
        this.shopifyService = shopifyService;
    }

    @GetMapping("/shopifyData")
    private Map getAllCustomers() {
        return shopifyService.retrieveData();
    }

    @GetMapping("/shopifyData")
    private Map persistShopifyData() {
        return shopifyService.retrieveData();
    }

    @GetMapping("/shopifyData/{id}")
    private ShopifyEntity getDataById(@PathVariable String id) {
        return shopifyService.retrieveFromDb(id);
    }



}
