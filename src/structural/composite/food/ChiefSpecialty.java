package structural.composite.food;

import structural.composite.MenuItem;

public class ChiefSpecialty implements MenuItem {
    @Override
    public String name() {
        return "Chief Specialty Food";
    }

    @Override
    public double price() {
        return 500;
    }
}
