package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(Buyer buyer, Product product, Payment payment, ModeOfDelivery modeOfDelivery, Vendor vendor) {
        return new OrderRequest(buyer, product, payment, modeOfDelivery, vendor);
    }
}
