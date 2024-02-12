package behavioral.mediator.auction;

import java.util.ArrayList;
import java.util.List;

import behavioral.mediator.auction.participant.Participant;

// Concrete Mediator
public class AuctionMediatorImpl implements AuctionMediator {

    private final List<Participant> buyers = new ArrayList<>();
    private final List<Participant> sellers = new ArrayList<>();
    private double highestBid;
    private Participant finalBuyer;

    @Override
    public void registerBuyer(Participant buyer) {
        buyers.add(buyer);
    }

    @Override
    public void registerSeller(Participant seller) {
        sellers.add(seller);
    }

    @Override
    public void placeBid(double amount, Participant buyer) {
        if (amount > highestBid) {
            highestBid = amount;
            finalBuyer = buyer;
            System.out.println("Placed new bid " + amount + " by buyer: " + buyer.getName());
        } else {
            System.out.println("Bid amount less than highest bid, ignoring...");
        }

    }

    @Override
    public void sellItem(Participant seller, Item item) {
        if (highestBid == 0 && finalBuyer == null) {
            System.out.println("Item '" + item.getName() + "' cannot be sold, no one placed bid yet!");
            return;
        }

        System.out.println("Item '" + item.getName() + "' sold with bid " + highestBid + " to " + finalBuyer.getName());
        seller.sellItem(item);
        highestBid = 0;
        finalBuyer = null;
    }

}
