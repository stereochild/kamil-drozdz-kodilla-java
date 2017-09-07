package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class HealtyShop implements Supplier {
    private static final String NAME = "Healthy Shop";
    private static final String ADRESS = "Wesoła";
    public List<Product> products;

    public HealtyShop(List<Product> products) {
        this.products = new ArrayList<Product>();
    }

    public static String getNAME() {return NAME;}
    public static String getADRESS() {return ADRESS;}
    public List<Product> getProducts() {return products;}

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("We have received your order. It is starting it's way from " + getADRESS() + " please be patient");
    }

    @Override
    public String toString() {
        return "HealtyShop{" +
                "products=" + products +
                '}';
    }
}
