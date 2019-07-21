package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShopInformationServiceSMS implements InformationService {
    public void inform(Product product, int itemsCount){
        System.out.println("SMS with order details (" + itemsCount + " of " + product.getProductName() + ") " +
                "has been sent to GlutenFreeShop");
    }
}
