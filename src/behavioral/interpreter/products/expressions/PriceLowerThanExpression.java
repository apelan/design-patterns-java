package behavioral.interpreter.products.expressions;

import java.util.List;

import behavioral.interpreter.products.Product;

public class PriceLowerThanExpression implements ProductExpression {

    private final double price;

    public PriceLowerThanExpression(double price) {
        this.price = price;
    }

    @Override
    public List<Product> interpret(List<Product> products) {
        return products.stream()
                .filter(f -> f.getPrice() < price)
                .toList();
    }
}
