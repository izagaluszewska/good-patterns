package com.kodilla.good.patterns.foodToDoor;

public class HealthyShop extends BaseShop implements OrderService {
    public HealthyShop(String name) {
        super(name);
    }

    public boolean process(Order order) {
        System.out.println("You ordered from: " + order.getBaseShop().getName() + " this product: " + order.getProduct().getName() + " in quantity: " + order.getQuantity() + "\n");
        return true;
    }
}
