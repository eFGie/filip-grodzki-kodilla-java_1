package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDto {
    private Product product;
    private int itemsCount;
    private boolean isOrderExecuted;

    public OrderDto(Product product, int itemsCount, boolean isOrderExecuted) {
        this.product = product;
        this.itemsCount = itemsCount;
        this.isOrderExecuted = isOrderExecuted;
    }

    public Product getProduct() {
        return product;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public boolean isOrderExecuted() {
        return isOrderExecuted;
    }
}
