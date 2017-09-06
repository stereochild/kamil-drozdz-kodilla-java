package com.kodilla.good.patterns.challenges.ishop;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrder = orderService.order(orderRequest.getUser(), orderRequest.getProduct());
        if(isOrder) {
            informationService.inform(orderRequest.getUser());
            System.out.println(orderRequest.toString());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
