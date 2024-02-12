package structural.composite.drink;

import structural.composite.MenuItem;

// LEAF
public class Beer implements MenuItem {


    private boolean alcoholPercentage;

    // Other beer properties...

    @Override
    public String name() {
        return "Beer";
    }

    @Override
    public double price() {
        return 200;
    }


    public boolean isAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(boolean alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }
}
