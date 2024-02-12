package behavioral.mediator.auction.participant;

import java.util.ArrayList;
import java.util.List;

import behavioral.mediator.auction.AuctionMediator;
import behavioral.mediator.auction.Item;

// Concrete Colleague interface
public class Seller extends Participant {

    protected List<Item> items;

    public Seller(AuctionMediator auction, String name, List<Item> items) {
        super(auction, name);
        this.items = new ArrayList<>(items);
    }

    @Override
    public void bid(double amount) {
        System.out.println("Seller cannot bid");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sellItem(Item item) {
        System.out.println("Item '" + item.getName() + "' sold by " + name + "!");
        items.remove(item);
    }
}
