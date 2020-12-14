package com.task.service;

import com.task.repository.ShopifyRepository;
import com.task.util.Constants;
import com.task.util.RestHelper;
import com.task.entity.ShopifyEntity;
import org.hibernate.mapping.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ShopifyService {

    private final ShopifyRepository shopifyRepository;

    public ShopifyService(ShopifyRepository shopifyRepository) {
        this.shopifyRepository = shopifyRepository;
    }

    public Map retrieveData(){
        ResponseEntity<Map> response = RestHelper.makeCall(Constants.SHOPIFY_URL);
        Map responseBody = response.getBody();
        return responseBody;
    }

    public ShopifyEntity save(ShopifyEntity shopifyEntity) {
        shopifyEntity.setId("1");
        return shopifyRepository.save(shopifyEntity);
    }

    public ShopifyEntity retrieveFromDb(String id) {
        return shopifyRepository.findAllById(id).orElseThrow(()-> new RuntimeException("Data not found"));
    }
}
