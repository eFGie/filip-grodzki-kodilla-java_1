package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequest {
    private Product product;
    private int itemsCount;

    public OrderRequest(final Product product,final int itemsCount) {
        this.product = product;
        this.itemsCount = itemsCount;
    }

    public Product getProduct() {
        return product;
    }

    public int getItemsCount() {
        return itemsCount;
    }
}