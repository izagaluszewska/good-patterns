package com.kodilla.good.patterns.challenges;

public class ModeOfDelivery {
    private String name;
    private double price;

    public ModeOfDelivery(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ModeOfDelivery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
