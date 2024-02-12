package behavioral.interpreter.products.expressions;

import java.util.List;

import behavioral.interpreter.products.Product;

public class CategoryProductExpression implements ProductExpression {
    private final List<String> categories;

    public CategoryProductExpression(String... categories) {
        this.categories = List.of(categories);
    }

    @Override
    public List<Product> interpret(List<Product> products) {
        return products.stream()
                .filter(p -> categories.contains(p.getCategory()))
                .toList();
    }

}
