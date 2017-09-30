package com.kodilla.good.patterns.challenges.Food2Door;

public class SupplierProcessor {

    public OrderDto supply(OrderRequest orderRequest) {

        Supplier supplier = orderRequest.getSupplier();
        supplier.process(orderRequest);
        return new OrderDto(orderRequest.getSupplier(), orderRequest.getProduct(), true);
    }
}
