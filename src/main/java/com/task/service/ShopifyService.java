package com.task.service;

import com.task.util.Constants;
import com.task.util.RestHelper;
import org.hibernate.mapping.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ShopifyService {

    public String retrieveData(){
        ResponseEntity<String> response = RestHelper.makeCall(Constants.SHOPIFY_URL);
        String responseBody = response.getBody();
        return responseBody;
    }

}
