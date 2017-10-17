package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    boolean createOrder(final Buyer buyer, final Product product, final Payment payment, final ModeOfDelivery modeOfDelivery, final Vendor vendor);
}
