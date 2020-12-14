package com.cust.service;

import com.cust.util.Constants;
import com.cust.util.RestHelper;
import org.hibernate.mapping.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ShopifyService {

    public Map retrieveData(){
        ResponseEntity<Map> response = RestHelper.makeCall(Constants.SHOPIFY_URL);
        Map responseBody = response.getBody();
        return responseBody;
    }
}
