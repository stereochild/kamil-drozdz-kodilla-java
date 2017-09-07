package com.kodilla.good.patterns.challenges.Food2Door;

public class SupplierDetails {
    private String name;
    private String adress;

    public SupplierDetails(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {return name;}
    public String getAdress() {return adress;}

    @Override
    public String toString() {
        return "SupplierDetails{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
