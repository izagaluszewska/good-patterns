package com.kodilla.good.patterns.challenges;

public class Payment {
    private String name;
    private boolean isPayed;

    public Payment(String name, boolean isPayed) {
        this.name = name;
        this.isPayed = isPayed;
    }

    public String getName() {
        return name;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "name='" + name + '\'' +
                ", isPayed=" + isPayed +
                '}';
    }
}
