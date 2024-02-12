package behavioral.interpreter.products.expressions;

import java.util.List;

import behavioral.interpreter.products.Product;

// Expression interface
public interface ProductExpression {
    List<Product> interpret(List<Product> products);
}
