package com.cust.util;

import org.hibernate.mapping.Map;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class RestHelper {

    public static ResponseEntity<Map> makeCall(String apiUrl) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON));
        headers.add("X-Shopify-Access-Token","a87522cc2e2551e43549aceb52e5d141");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<Map> response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, Map.class);
        return response;
    }
}
