package com.kodilla.good.patterns.foodToDoor;

public class OrderConfirm {
    OrderService orderService;
    Order order;

    public OrderConfirm(OrderService orderService, Order order) {
        this.orderService = orderService;
        this.order = order;
    }

    void confirmOrder(final Order order) {
        boolean isOrdered = orderService.process(order);

        if (isOrdered) {
            System.out.println("Order created\n");
        } else {
            System.out.println("Order not completed\n");
        }
    }
}
