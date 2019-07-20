package com.kodilla.good.patterns.challenges;

public  class Product {
    private final int productID;
    private final String productName;
    private final double productPrice;

    public Product(final int productID, final String productName, final double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductID() { return productID; }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

}
