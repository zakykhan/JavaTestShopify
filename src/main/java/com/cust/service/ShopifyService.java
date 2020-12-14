package com.cust.service;

import org.hibernate.mapping.Map;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class ShopifyService {

    public Map getData(){
        String apiUrl = "https://e3519ce8d2b72750210800f3ba7115f2:a87522cc2e2551e43549aceb52e5d141@securecod4.myshopify.com/admin/api/2020-07/products.json";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON));
        headers.add("X-Shopify-Access-Token","a87522cc2e2551e43549aceb52e5d141");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<Map> response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, Map.class);
        Map responseBody = response.getBody();
        return responseBody;
    }

    public static void main(String[] args){
        ShopifyService ss  = new ShopifyService() ;
        System.out.println(ss.getData());
    }

}
