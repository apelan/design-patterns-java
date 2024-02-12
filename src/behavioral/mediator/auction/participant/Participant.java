package behavioral.mediator.auction.participant;

import behavioral.mediator.auction.AuctionMediator;
import behavioral.mediator.auction.Item;

// Colleague interface
public abstract class Participant {
    // reference to mediator
    protected AuctionMediator auction;
    protected String name;

    public Participant(AuctionMediator auction, String name) {
        this.auction = auction;
        this.name = name;
    }

    public abstract void bid(double amount);
    public abstract void sellItem(Item item);
    public abstract String getName();

}
