package com.task.controller;

import com.google.gson.Gson;
import com.task.service.ShopifyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ShopifyController {

    private final ShopifyService shopifyService;

    public ShopifyController(ShopifyService shopifyService) {
        this.shopifyService = shopifyService;
    }

    @GetMapping("/shopifyData")
    private Map getAllCustomers() {
        String response = shopifyService.retrieveData();
        return toMap(response);
    }

    private Map toMap(String response) {
        Gson gson = new Gson();
        return gson.fromJson(response, Map.class);
    }
}
