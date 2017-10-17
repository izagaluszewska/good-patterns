package com.kodilla.good.patterns.challenges;

class MailService implements InformationService {
    private void sendEmail(Buyer buyer, Vendor vendor) {
        System.out.println("\nEmail send to buyer:\n" + buyer.toString() + "\nEmail send to vendor:\n" + vendor.toString());
    }

    public void inform(Buyer buyer, Vendor vendor) {
        sendEmail(buyer, vendor);
    }
}
