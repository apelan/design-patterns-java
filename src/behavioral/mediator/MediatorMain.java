package behavioral.mediator;

import java.util.List;

import behavioral.mediator.auction.AuctionMediator;
import behavioral.mediator.auction.AuctionMediatorImpl;
import behavioral.mediator.auction.Item;
import behavioral.mediator.auction.participant.Buyer;
import behavioral.mediator.auction.participant.Participant;
import behavioral.mediator.auction.participant.Seller;

public class MediatorMain {

    public static void main(String[] args) {

        AuctionMediator auction = new AuctionMediatorImpl();

        Item valuableItem = new Item("Valuable Item");
        Item superValuableItem = new Item("Super Valuable Item");
        Participant seller = new Seller(auction, "Bestseller", List.of(valuableItem, superValuableItem));
        Participant buyer1 = new Buyer(auction, "Buyer1");
        Participant buyer2 = new Buyer(auction, "Buyer2");

        auction.registerSeller(seller);
        auction.registerBuyer(buyer1);
        auction.registerBuyer(buyer2);

        System.out.println("---------");
        buyer1.bid(100);
        buyer2.bid(200);
        buyer1.bid(300);
        buyer2.bid(400);
        buyer1.bid(500);

        System.out.println("---------");
        auction.sellItem(seller, valuableItem);
        System.out.println("---------");
//        buyer1.bid(300);
//        buyer2.bid(1700);
        auction.sellItem(seller, superValuableItem);
        System.out.println("---------");

    }

}
