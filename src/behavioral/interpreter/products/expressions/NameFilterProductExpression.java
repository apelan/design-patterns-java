package behavioral.interpreter.products.expressions;

import java.util.List;

import behavioral.interpreter.products.Product;

public class NameFilterProductExpression implements ProductExpression {

    private final String name;

    public NameFilterProductExpression(String name) {
        this.name = name;
    }

    @Override
    public List<Product> interpret(List<Product> products) {
        return products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .toList();
    }
}
