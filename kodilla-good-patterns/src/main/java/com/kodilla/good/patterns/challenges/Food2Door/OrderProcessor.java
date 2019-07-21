package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class OrderProcessor {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private ProductOrderService productOrderService;

    public OrderProcessor(final InformationService informationService, final OrderRepository orderRepository,
                          final ProductOrderService productOrderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.productOrderService = productOrderService;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrderExecuted = productOrderService.order(orderRequest.getProduct(),orderRequest.getItemsCount());
        if(isOrderExecuted) {
            informationService.inform(orderRequest.getProduct(),orderRequest.getItemsCount());
            orderRepository.createOrder(orderRequest.getProduct(),orderRequest.getItemsCount(), LocalDateTime.now());
            return new OrderDto(orderRequest.getProduct(),orderRequest.getItemsCount(),true);
        } else {
            return new OrderDto(orderRequest.getProduct(),orderRequest.getItemsCount(),false);
        }
    }
}
