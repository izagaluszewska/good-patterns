package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class Vendor extends User {
    List<Product> goodsForSale = new ArrayList<>();

    public Vendor(String name, String surname, String nick, int age, double averageNote, String address, List<Product> goodsForSale) {
        super(name, surname, nick, age, averageNote, address);
        this.goodsForSale = goodsForSale;
    }

    public List<Product> getGoodsForSale() {
        return goodsForSale;
    }
}
