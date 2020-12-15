package com.task.controller;

import com.task.service.ShopifyService;
import org.hibernate.mapping.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopifyController {

    private final ShopifyService shopifyService;

    public ShopifyController(ShopifyService shopifyService) {
        this.shopifyService = shopifyService;
    }

    @GetMapping("/shopifyData")
    private String getAllCustomers() {
        return shopifyService.retrieveData();
    }
}
