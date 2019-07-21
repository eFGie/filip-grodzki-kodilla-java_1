package com.kodilla.good.patterns.challenges.Food2Door;

public final class Product {
    private final int productID;
    private final String productName;

    public Product(final int productID,final String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }
}
