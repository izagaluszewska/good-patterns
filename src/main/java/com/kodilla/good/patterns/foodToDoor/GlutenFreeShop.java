package com.kodilla.good.patterns.foodToDoor;

public class GlutenFreeShop extends BaseShop implements OrderService {
    public GlutenFreeShop(String name) {
        super(name);
    }

    public boolean process(Order order) {
        System.out.println("You ordered " + order.getProduct().getName() + " in quantity: " + order.getQuantity() + " from " + order.getBaseShop().getName() + "\n");
        return true;
    }
}
