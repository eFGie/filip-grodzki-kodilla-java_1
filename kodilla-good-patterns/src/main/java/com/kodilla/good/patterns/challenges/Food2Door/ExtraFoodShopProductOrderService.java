package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShopProductOrderService implements ProductOrderService {
    public boolean order(Product product, int itemsCount) {
        System.out.println("Order created in ExtraFoodShop for " + itemsCount + " of " + product.getProductName());
        return true;
    }
}
