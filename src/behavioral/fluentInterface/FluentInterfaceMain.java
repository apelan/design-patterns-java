package behavioral.fluentInterface;

import behavioral.fluentInterface.shop.Product;
import behavioral.fluentInterface.shop.ShoppingCart;

public class FluentInterfaceMain {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart()
                .add(new Product("Intel i7-12700k", 450.00))
                .add(new Product("NVidia RTX4090", 2000.00))
                .add(new Product("Kingston Fury", 80.00))
                .remove(new Product("Intel i7-12700k", 450.00))
                .add(new Product("AMD Ryzen 7 5800X", 250.00));

        cart.printReceipt();

        cart.reset()
                .add(new Product("Fan", 10.00))
                .applyDiscount(15);

        cart.printReceipt();

    }

}
