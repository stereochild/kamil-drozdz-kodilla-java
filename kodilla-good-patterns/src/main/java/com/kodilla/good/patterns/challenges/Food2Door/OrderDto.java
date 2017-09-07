package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDto {
    private final Supplier supplier;
    private final Product product;
    private final boolean ordered;

    public OrderDto(Supplier supplier, Product product, boolean ordered) {
        this.supplier = supplier;
        this.product = product;
        this.ordered = ordered;
    }

    public Supplier getSupplier() {return supplier;}
    public Product getProduct() {return product;}
    public boolean isOrdered() {return ordered;}
}
