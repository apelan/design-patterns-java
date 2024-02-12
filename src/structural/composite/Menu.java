package structural.composite;


import java.util.ArrayList;
import java.util.List;

// COMPOSITE
public class Menu implements MenuItem {
    private final String name;
    private final List<MenuItem> items = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addIdem(MenuItem item) {
        items.add(item);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return items.stream()
                .mapToDouble(MenuItem::price)
                .sum();
    }

    public void printItems() {
        System.out.printf("Menu: %s", name);
        System.out.println();
        items.forEach(item -> {
            System.out.printf("Item '%s' with price: %s$", item.name(), item.price());
            System.out.println();
        });
    }

}
