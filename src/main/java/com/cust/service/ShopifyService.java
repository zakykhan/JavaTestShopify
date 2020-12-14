package com.cust.service;

import com.cust.repository.ShopifyRepository;
import com.cust.util.Constants;
import com.cust.util.RestHelper;
import com.entity.ShopifyEntity;
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
