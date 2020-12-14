package com.task.entity;

import javax.persistence.*;
import java.util.Map;

@Entity
public class ShopifyEntity {
    @Id
    private String id;

    @ElementCollection
    Map<Object, Object> shopifyData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<Object, Object> getShopifyData() {
        return shopifyData;
    }

    public void setShopifyData(Map<Object, Object> shopifyData) {
        this.shopifyData = shopifyData;
    }
}
