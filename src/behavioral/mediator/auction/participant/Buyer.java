package behavioral.mediator.auction.participant;

import behavioral.mediator.auction.AuctionMediator;
import behavioral.mediator.auction.Item;

// Concrete Colleague interface
public class Buyer extends Participant {
    public Buyer(AuctionMediator auction, String name) {
        super(auction, name);
    }

    @Override
    public void bid(double amount) {
        // colleagues here communicate only via mediator (auction in this case)
        auction.placeBid(amount, this);
    }

    @Override
    public void sellItem(Item item) {
        System.out.println("Buyers cannot sell items.");
    }

    @Override
    public String getName() {
        return name;
    }
}
