package com.geekster.WeeklyTest3;

public class Seller {

    private String product = "Head-phones";


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Seller() {

        System.out.println("Seller called from Spring framework-1");
    }

    public Seller(String name) {


        this.product = product;

        System.out.println("Seller called from Spring framework-2 : "  + this.product);
    }
}
