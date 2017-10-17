package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public Buyer buyer;
    public Vendor vendor;
    public boolean isOrdered;

    public OrderDto(final Buyer buyer, final Vendor vendor, final boolean isOrdered) {
        this.buyer = buyer;
        this.vendor = vendor;
        this.isOrdered = isOrdered;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
