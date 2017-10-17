package com.kodilla.good.patterns.foodToDoor;

public class Application {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop");
        HealthyShop healthyShop = new HealthyShop("HealthyShop");

        Product mushrooms = new Product("mushrooms");
        Product pasta = new Product("pasta");
        Product salami = new Product("salami");

        Order orderEFS = new Order(extraFoodShop, mushrooms, 20);
        Order orderGFS = new Order(glutenFreeShop, pasta, 2);
        Order orderHS = new Order(healthyShop, salami, 200);

        OrderConfirm orderConfirmEFS = new OrderConfirm(extraFoodShop, orderEFS);
        OrderConfirm orderConfirmGFS = new OrderConfirm(glutenFreeShop, orderGFS);
        OrderConfirm orderConfirmHS = new OrderConfirm(healthyShop, orderHS);

        orderConfirmEFS.confirmOrder(orderEFS);
        orderConfirmGFS.confirmOrder(orderGFS);
        orderConfirmHS.confirmOrder(orderHS);
    }
}
