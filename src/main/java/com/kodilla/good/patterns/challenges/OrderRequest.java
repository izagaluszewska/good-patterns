package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    public Buyer buyer;
    public Product product;
    public Payment payment;
    public ModeOfDelivery modeOfDelivery;
    public Vendor vendor;

    public OrderRequest(Buyer buyer, Product product, Payment payment, ModeOfDelivery modeOfDelivery, Vendor vendor) {
        this.buyer = buyer;
        this.product = product;
        this.payment = payment;
        this.modeOfDelivery = modeOfDelivery;
        this.vendor = vendor;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public Payment getPayment() {
        return payment;
    }

    public ModeOfDelivery getModeOfDelivery() {
        return modeOfDelivery;
    }

    public Vendor getVendor() {
        return vendor;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "buyer=" + buyer +
                ", product=" + product +
                ", payment=" + payment +
                ", modeOfDelivery=" + modeOfDelivery +
                ", vendor=" + vendor +
                '}';
    }
}
