package com.kodilla.good.patterns.foodToDoor;

public class Order {
    public BaseShop baseShop;
    public Product product;
    public int quantity;

    public Order(BaseShop baseShop, Product product, int quantity) {
        this.baseShop = baseShop;
        this.product = product;
        this.quantity = quantity;
    }

    public BaseShop getBaseShop() {
        return baseShop;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "baseShopName=" + baseShop +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
