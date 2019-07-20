package com.kodilla.good.patterns.challenges;

public class ProductOrderApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRquest orderRquest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new SmsService(), new BikeOrderRepository(),
                new BikeOrderService());
        orderProcessor.process(orderRquest);
    }
}
