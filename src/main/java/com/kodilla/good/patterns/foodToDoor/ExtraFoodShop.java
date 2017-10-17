package com.kodilla.good.patterns.foodToDoor;

public class ExtraFoodShop extends BaseShop implements OrderService {
    public ExtraFoodShop(String name) {
        super(name);
    }

    public boolean process(Order order) {
        System.out.println("Order quantity: " + order.getQuantity() + " of " + order.getProduct().getName() + " from " + order.getBaseShop().getName() + "\n");
        return true;
    }
}
