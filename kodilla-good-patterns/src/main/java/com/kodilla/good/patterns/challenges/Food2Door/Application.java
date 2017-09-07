package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {

        OrderRequest orderRequest = new OrderRequest(new GlutenFreeShop(new SupplierDetails("Gluten Free Shop", "Konik Nowy")), new Product("carrot (box)", 9.3), 1);
        SupplierProcessor supplierProcessor = new SupplierProcessor();
        supplierProcessor.supply(orderRequest);
    }
}
