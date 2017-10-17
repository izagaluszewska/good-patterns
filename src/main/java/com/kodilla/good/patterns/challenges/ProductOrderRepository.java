package com.kodilla.good.patterns.challenges;

class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(final Buyer buyer, final Product product, final Payment payment, final ModeOfDelivery modeOfDelivery, final Vendor vendor) {
        System.out.println("\nCreating repository:\nBuyer: " + buyer.getNick() + " placed order for: " + product.getName() + " from vendor: " + vendor.getNick() + " and chose type of payment: " + payment.getName() + " and next mode of delivery: " + modeOfDelivery.getName());
        return true;
    }
}
