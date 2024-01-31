package com.emexo.collection.list;

import java.util.List;

public class Product implements Comparable<Product>{
    private int productId;

    private String productName;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product product) {
       // return this.getProductId() - product.getProductId();
        return this.getProductName().compareTo(product.getProductName());
    }
}
