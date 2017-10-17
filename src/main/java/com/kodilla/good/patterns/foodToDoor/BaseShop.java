package com.kodilla.good.patterns.foodToDoor;

public class BaseShop {
    String name;

    public BaseShop(String name) {
        this.name = name;
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "BaseShop{" +
                "name='" + name + '\'' +
                '}';
    }
}
