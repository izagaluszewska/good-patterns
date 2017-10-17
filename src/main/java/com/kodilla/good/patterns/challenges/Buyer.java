package com.kodilla.good.patterns.challenges;

public class Buyer extends User {
    public Buyer(String name, String surname, String nick, int age, double averageNote, String address) {
        super(name, surname, nick, age, averageNote, address);
    }

    public void placeOrder(Product product) {
        System.out.println("Place order for chosen product" + product);
    }
}
