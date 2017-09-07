package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequest {
    private final Supplier supplier;
    private final Product product;
    private final int quantity;

    public OrderRequest(final Supplier supplier, final Product product, final int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {return supplier;}
    public Product getProduct() {return product;}
    public int getQuantity() {return quantity;}
    public double totalPrice() {return quantity * product.getProductPrice();}

    @Override
    public String toString() {
        return "OrderRequest{" +
                "supplier=" + supplier +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
