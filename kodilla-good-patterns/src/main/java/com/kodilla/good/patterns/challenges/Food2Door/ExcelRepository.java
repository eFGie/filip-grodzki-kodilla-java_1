package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class ExcelRepository implements  OrderRepository {
    public  void createOrder (Product product, int itemsCount, LocalDateTime orderCreateDateTime){
        System.out.println("Order for " + itemsCount + " of " + product.getProductName() +
                " saved in Excel at " + orderCreateDateTime);
    }
}
