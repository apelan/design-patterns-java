package structural.composite.food;

import structural.composite.MenuItem;

// LEAF
public class Pizza implements MenuItem {

    // other pizza properties

    @Override
    public String name() {
        return "Pizza";
    }

    @Override
    public double price() {
        return 150;
    }
}
