package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        Product product = new Product(101,"Chocolate");
        int itemsCount = 175;

        return new OrderRequest(product, itemsCount);
    }
}
