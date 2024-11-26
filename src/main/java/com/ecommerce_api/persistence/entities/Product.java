package com.ecommerce_api.persistence.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {

    @Id
    public Long sku;
    public String name;
    public float price;
    public int stock;

}