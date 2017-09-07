package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Supplier{
    private SupplierDetails supplierDetails;
    public List<Product> products;

    public GlutenFreeShop(SupplierDetails supplierDetails) {
        this.supplierDetails = supplierDetails;
        this.products = new ArrayList<>();
    }

    public SupplierDetails getSupplierDetails() {
        return supplierDetails;
    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println(supplierDetails.getName() + " completed your order.");
    }
}
