package behavioral.strategy.discount;

public class Item {

    private final String name;
    private final double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // here we can easily use any strategy to apply discount
    public double getPriceWithDiscount(Discount discount) {
        return discount.apply(this.price);
    }

}
