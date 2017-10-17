package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.createOrder(orderRequest.getBuyer(), orderRequest.getProduct(), orderRequest.getPayment(), orderRequest.getModeOfDelivery(), orderRequest.getVendor());

        if (isOrdered) {
            informationService.inform(orderRequest.getBuyer(), orderRequest.getVendor());
            orderRepository.createOrder(orderRequest.getBuyer(), orderRequest.getProduct(), orderRequest.getPayment(), orderRequest.getModeOfDelivery(), orderRequest.getVendor());
            return new OrderDto(orderRequest.getBuyer(), orderRequest.getVendor(), true);
        } else {
            return new OrderDto(orderRequest.getBuyer(), orderRequest.getVendor(), false);
        }
    }
}

