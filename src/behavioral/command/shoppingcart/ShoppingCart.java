package behavioral.command.shoppingcart;

import java.util.ArrayList;
import java.util.List;

// Receiver
public class ShoppingCart {

    private List<String> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void checkout() {
        System.out.println("=== Purchase complete ===");
        items.forEach(System.out::println);
        System.out.println("=========================");
        items.clear();
    }
}
