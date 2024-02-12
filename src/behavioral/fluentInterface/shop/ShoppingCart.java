package behavioral.fluentInterface.shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> products;
    private double currentPrice;

    public ShoppingCart() {
        products = new ArrayList<>();
        currentPrice = 0.0d;
    }

    public ShoppingCart add(Product product) {
        products.add(product);
        currentPrice += product.getPrice();
        return this;
    }

    public ShoppingCart remove(Product product) {
        products.remove(product);
        currentPrice -= product.getPrice();
        return this;
    }

    public ShoppingCart reset() {
        products.clear();
        currentPrice = 0.0d;
        return this;
    }

    public ShoppingCart applyDiscount(int percentage) {
        currentPrice = currentPrice - ((currentPrice * percentage) / 100);
        return this;
    }

    public void printReceipt() {
        System.out.println("------ RECEIPT -------");
        products.forEach(System.out::println);
        System.out.println("-------------");
        System.out.println("Total price " + currentPrice);
        System.out.println("----------------------");
    }

}
