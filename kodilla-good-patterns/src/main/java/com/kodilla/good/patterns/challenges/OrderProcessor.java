package com.kodilla.good.patterns.challenges;

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

    public OrderDto process(final OrderRquest orderRquest){
        boolean isBought = productOrderService.order(orderRquest.getUser(),orderRquest.getOrderCreateDateTime());
          if(isBought) {
              informationService.inform(orderRquest.getUser());
              orderRepository.createOrder(orderRquest.getUser(),orderRquest.getOrderCreateDateTime());
              return new OrderDto(orderRquest.getUser(),true);
          } else {
              return new OrderDto(orderRquest.getUser(),false);
          }
    }
}
