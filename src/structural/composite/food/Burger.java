package structural.composite.food;

import structural.composite.MenuItem;

// LEAF
public class Burger implements MenuItem {

    // Other burger properties

    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public double price() {
        return 200;
    }
}
