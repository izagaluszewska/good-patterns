package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Buyer ari = new Buyer("Ariadna", "Kowalska", "ari", 18, 5, "ul. Pucka 3, 40-200 Warszawa");
        Buyer tomek = new Buyer("Tomasz", "Szczygiel", "tomas", 20, 4, "ul. Helska 2, 30-200 Koszalin");
        Product tv = new Product("tv", 1500, "new tv 40''");
        Product game = new Product("The witcher", 200, "II edition");
        List<Product> peterGoodsForSale = new ArrayList<>();
        peterGoodsForSale.add(tv);
        peterGoodsForSale.add(game);
        Vendor peter = new Vendor("Piotr", "Slugocki", "peter", 40, 3.8, "ul. Kosynierow 20, 30-260 Kielce", peterGoodsForSale);
        Payment cash = new Payment("cash", true);
        ModeOfDelivery courier = new ModeOfDelivery("courier", 100);

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequestAri = orderRequestRetriever.retrieve(ari, tv, cash, courier, peter);
        OrderRequest orderRequestTomek = orderRequestRetriever.retrieve(tomek, game, cash, courier, peter);

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequestAri);
        orderProcessor.process(orderRequestTomek);
    }
}
