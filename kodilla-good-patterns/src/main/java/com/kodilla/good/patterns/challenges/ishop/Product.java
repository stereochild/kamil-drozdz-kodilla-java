package com.kodilla.good.patterns.challenges.ishop;

public class Product {
    private final String productName;
    private final double productPrice;

    public Product(final String productName, final double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {return productName;}

    public double getProductPrice() {return productPrice;}

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
