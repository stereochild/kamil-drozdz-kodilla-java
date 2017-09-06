package com.kodilla.good.patterns.challenges.ishop;

public class Invoice {
    private int orderId;
    private int productQuantity;
    private double totalPrice;
    private Product product;

    public Invoice(int orderId, int productQuantity, double totalPrice, Product product) {
        this.orderId = orderId;
        this.productQuantity = productQuantity;
        this.totalPrice = totalPrice;
        this.product = product;
    }

    public int getOrderId() {return orderId;}

    public int getProductQuantity() {return productQuantity;}

    public double getTotalPrice() {return totalPrice = productQuantity * product.getProductPrice();}
}
