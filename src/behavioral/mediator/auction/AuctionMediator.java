package behavioral.mediator.auction;

import behavioral.mediator.auction.participant.Participant;

// This is Mediator Interface
public interface AuctionMediator {
    void registerBuyer(Participant buyer);
    void registerSeller(Participant seller);
    void placeBid(double amount, Participant buyer);
    void sellItem(Participant seller, Item item);

}
