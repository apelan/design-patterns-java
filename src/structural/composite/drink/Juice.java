package structural.composite.drink;

import structural.composite.MenuItem;

// LEAF
public class Juice implements MenuItem {

    // Other juice properties

    @Override
    public String name() {
        return "Juice";
    }

    @Override
    public double price() {
        return 100;
    }
}
