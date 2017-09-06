package com.kodilla.good.patterns.challenges.ishop;

public class OrderRequest {
    public final User user;
    public final int orderId;
    public final Product product;
    public final int productQuantity;
    public final double totalPrice;

    public OrderRequest(final User user, final int orderId, final Product product, final int productQuantity, final double totalPrice) {
        this.user = user;
        this.orderId = orderId;
        this.product = product;
        this.productQuantity = productQuantity;
        this.totalPrice = totalPrice;
    }

    public User getUser() {return user;}
    public int getOrderId() {return orderId;}
    public Product getProduct() {return product;}
    public int getProductQuantity() {return productQuantity;}
    public double getTotalPrice() {return productQuantity * product.getProductPrice();}

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", orderId=" + orderId +
                ", product=" + product +
                ", productQuantity=" + productQuantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
