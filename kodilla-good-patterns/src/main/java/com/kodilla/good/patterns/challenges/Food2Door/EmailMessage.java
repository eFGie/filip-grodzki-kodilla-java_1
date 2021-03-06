package com.kodilla.good.patterns.challenges.Food2Door;

public class EmailMessage implements InformationService{
    public void inform(Product product, int itemsCount){
        System.out.println("Email with order details (" + itemsCount + " of " + product.getProductName() + ") " +
                "has been sent");
    }
}
