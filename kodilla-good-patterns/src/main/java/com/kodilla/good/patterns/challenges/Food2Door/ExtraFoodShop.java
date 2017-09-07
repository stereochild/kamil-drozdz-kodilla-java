package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Supplier {
    private static final String NAME = "Extra Food Shop";
    private static final String ADRESS = "Stojadła";
    public List<Product> products;

    public ExtraFoodShop() {
        this.products = new ArrayList<Product>();
    }

    public static String getNAME() {return NAME;}
    public static String getADRESS() {return ADRESS;}
    public List<Product> getProducts() {return products;}

    @Override
    public void process(OrderRequest orderRequest){
        System.out.println("Order from " + getNAME() + " created.");
    }

    @Override
    public String toString() {
        return "ExtraFoodShop{" +
                "products=" + products +
                '}';
    }
}
