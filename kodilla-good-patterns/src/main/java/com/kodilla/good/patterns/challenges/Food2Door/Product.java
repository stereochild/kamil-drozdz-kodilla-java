package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {
    private final String productName;
    private final double productPrice;

    public Product(final String productName, final double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {return productName;}
    public double getProductPrice() {return productPrice;}
}
