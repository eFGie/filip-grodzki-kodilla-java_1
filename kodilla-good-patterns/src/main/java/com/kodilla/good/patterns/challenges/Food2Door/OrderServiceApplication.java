package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderServiceApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest OrderRequest = orderRequestRetriever.retrieve();

        //1. information service oraz repository stworzone dla konkretnego dostawcy
        OrderProcessor orderProcessorExtraFoodShop = new OrderProcessor(new ExtraFoodShopInformationSerivceEmail(),
        new ExtraFoodShopOrderRepositoryExcel(), new ExtraFoodShopProductOrderService());
        orderProcessorExtraFoodShop.process(OrderRequest);

        System.out.println();
        //2. information service oraz repository podane ogólnie - trzeba pewnie jeszcze przekazać Dostawcę
        OrderProcessor orderProcessorExtraFoodShop_2 = new OrderProcessor(new EmailMessage(),
                new ExcelRepository(), new ExtraFoodShopProductOrderService());
        orderProcessorExtraFoodShop_2.process(OrderRequest);

        System.out.println();
        //1.
        OrderProcessor orderProcessorGlutenFreeShop = new OrderProcessor(new GlutenFreeShopInformationServiceSMS(),
                new GlutenFreeShopOrderRepositoryTextFile(), new GlutenFreeShopProductOrderService());
        orderProcessorGlutenFreeShop.process(OrderRequest);

        System.out.println();
        //2.
        OrderProcessor orderProcessorGlutenFreeShop_2 = new OrderProcessor(new SmsMessage(),
               new TextFileRepository(), new GlutenFreeShopProductOrderService());
        orderProcessorGlutenFreeShop_2.process(OrderRequest);


    }
}
